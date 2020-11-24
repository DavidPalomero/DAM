using Microsoft.Win32;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace Industria4_0
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        //lista de los productos
        private List<Productos> listaProductos = new List<Productos>();

        public MainWindow()
        {
            InitializeComponent();
            this.Left = 5; this.Top = 5;
            VisualizaProductos();

        }
        private void VisualizaProductos()
        {
            //abrir un fichero
            string fileName = "productos.json";
            string json = File.ReadAllText(fileName); //contenido del archivo

            listaProductos = JsonConvert.DeserializeObject<List<Productos>>(json);

            int fil = 0;

            foreach (Productos p in listaProductos)
            {
                // Definimos la fila y la añadimos

                int num = fil % 2;
                rejillaProductos.RowDefinitions.Add(new RowDefinition { 
                    Style = (Style)this.Resources[(num == 0) ? "Par" : "Impar"] // Intento Poner el estilo de par o inpar
                });

                
                BitmapImage bi = new BitmapImage();
                bi.BeginInit();
                bi.UriSource = new Uri(Environment.CurrentDirectory + "/" + p.UrlImagen);
                bi.EndInit();

                Grid grid = new Grid();
                Grid.SetRow(grid, fil);
                Grid.SetColumn(grid, 0);
                grid.Children.Add(new Image { Source = bi,
                    Height = 100,
                    Width = 100
                });
                rejillaProductos.Children.Add(grid);

                //contenido del Id_Articulo
                Label lb1 = new Label();
                lb1.Content = p.Id_Articulo;
                Grid.SetRow(lb1, fil);
                Grid.SetColumn(lb1, 1);
                rejillaProductos.Children.Add(lb1);

                //contenido del Descripcion
                Label lb2 = new Label();
                lb2.Content = p.Descripcion;
                Grid.SetRow(lb2, fil);
                Grid.SetColumn(lb2, 2);
                rejillaProductos.Children.Add(lb2);

                //contenido del Stock
                Label lb3 = new Label();
                lb3.Content = p.Stock;
                Grid.SetRow(lb3, fil);
                Grid.SetColumn(lb3, 3);
                rejillaProductos.Children.Add(lb3);

                //contenido del StockMinimo
                Label lb4 = new Label();
                lb4.Content = p.StockMinimo;
                Grid.SetRow(lb4, fil);
                Grid.SetColumn(lb4, 4);
                rejillaProductos.Children.Add(lb4);

                //contenido del TiempoFabricacionAcumulado
                Label lb5 = new Label();
                lb5.Content = p.TiempoFabricacionAcumulado;
                Grid.SetRow(lb5, fil);
                Grid.SetColumn(lb5, 5);
                rejillaProductos.Children.Add(lb5);

                //aumnetamos en uno la fila por cada paso del bucle
                fil++;
            }
        }


        private void GrabarFichero_Click(object sender, RoutedEventArgs e)
        {
            SaveFileDialog sfd = new SaveFileDialog
            {
                Filter = "Fichero JSON|*.json",
                Title = "Selecciona un archivo"
            };
        }


        private void Leer_Click(object sender, RoutedEventArgs e)
        {
            //abrir un fichero
            OpenFileDialog ofd = new OpenFileDialog
            {
                Filter = "Fichero JSON|*.json",
                Multiselect = false,
                Title = "Selecciona un archivo"
            };

            //comprobar si abre el fichero correctamente 
            if (ofd.ShowDialog() == true)
            {
                string fileName = ofd.FileName; //Ruta del archivo
                string json = File.ReadAllText(fileName); //contenido del archivo

                listaProductos = JsonConvert.DeserializeObject<List<Productos>>(json);

                RegistroApuntes.ItemsSource = listaProductos;
            }
            else // Si no habre el fichero correctamente entonces muestra un mensaje
            {
                MessageBox.Show("Error al abrir el fuchero");
            }
        }

        private void Salir_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        private void RegistroApuntes_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {

        }
    }
}
