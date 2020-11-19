using Microsoft.Win32;
using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace RepasoAaron
{
    /// <summary>
    /// Lógica de interacción para ManejoFicheros.xaml
    /// </summary>
    public partial class ManejoFicheros : Window
    {
        private string? fileName;
        //Nullable<String> fileName;
        private string url = @Environment.CurrentDirectory.ToString();

        public ManejoFicheros()
        {
            InitializeComponent();
        }

        private void Window_Loaded(object sender, RoutedEventArgs e)
        {
            //vacia el richtextVox al cargar la ventana
            editorTexto.Document.Blocks.Clear();

            //abrir un fichero
            OpenFileDialog ofd = new OpenFileDialog
            {
                InitialDirectory = url,
                Filter = "JSON|*.json|Fichero Texto|*.txt",
                Multiselect = false,
                Title = "Seleccione un Fichero"
            };

            //comprueba si hay errores
            if (ofd.ShowDialog() == true)
            {
                fileName = ofd.FileName;
                editorTexto.Document.Blocks.Add(new Paragraph(new Run(File.ReadAllText(fileName))));
            }
        }

        private void comBorrar(object sender, ExecutedRoutedEventArgs e)
        {
            OpenFileDialog ofd = new OpenFileDialog
            {
                InitialDirectory = url,
                Filter = "JSON|*.json|Fichero Texto|*.txt",
                Multiselect = false,
                Title = "Seleccione un Fichero"
            };

            if (ofd.ShowDialog() == true)
            {
                File.Delete(fileName);
            } 
            else
            {
                MessageBox.Show("Error al borrar el fichero");
            }
        }

            private void comGuardar(object sender, ExecutedRoutedEventArgs e)
        {
            if (fileName != null && fileName != "")
            {
                // el archivo esta creado
                string texto = new TextRange(editorTexto.Document.ContentStart, editorTexto.Document.ContentEnd).Text;
                File.WriteAllText(fileName, texto);

            } else
            {
                //si el archivo no esta creado
                SaveFileDialog sfd = new SaveFileDialog
                {
                    InitialDirectory = url,
                    Filter = "JSON|*.json|Fichero Texto|*.txt",
                    Title = "Seleccione un Fichero"
                };

                if (sfd.ShowDialog() == false)
                {
                    MessageBox.Show("Error al guardar el archivo");
                } else
                {
                    fileName = sfd.FileName;
                    string texto = new TextRange(editorTexto.Document.ContentStart, editorTexto.Document.ContentEnd).Text;
                    File.WriteAllText(fileName, texto);
                }
            }
        }

        private void CommandBinding_Executed(object sender, ExecutedRoutedEventArgs e)
        {
            this.Close();
        }
           

        private void comNuevo(object sender, ExecutedRoutedEventArgs e)
        {
            fileName = null;
            editorTexto.Document.Blocks.Clear();
        }

        private void abrirFichero()
        {
            //vacia el richtextVox al cargar la ventana
            editorTexto.Document.Blocks.Clear();

            //abrir un fichero
            OpenFileDialog ofd = new OpenFileDialog
            {
                InitialDirectory = url,
                Filter = "JSON|*.json|Fichero Texto|*.txt",
                Multiselect = false,
                Title = "Seleccione un Fichero"
            };

            //comprueba si hay errores
            if (ofd.ShowDialog() == true)
            {
                fileName = ofd.FileName;
                editorTexto.Document.Blocks.Add(new Paragraph(new Run(File.ReadAllText(fileName))));
            }
        }
    }
}
