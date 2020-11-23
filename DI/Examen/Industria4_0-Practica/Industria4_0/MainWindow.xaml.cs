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
        //lista de los productos y fabricados
        private List<Productos> listaProductos = new List<Productos>();
        private List<Fabricados> listaFabricados = new List<Fabricados>();
        private List<Productos> productosFabrica = new List<Productos>();

        public MainWindow()
        {
            InitializeComponent();
            this.Left = 5; this.Top = 5;
            VisualizaProductos();

        }
        private void VisualizaProductos()
        {
            //abrir un fichero
            string jsonProductos = File.ReadAllText("productos.json"); //contenido del archivo
            string jsonFabricados = File.ReadAllText("fabricados.json"); //contenido del archivo

            listaFabricados = JsonConvert.DeserializeObject<List<Fabricados>>(jsonFabricados);
            listaProductos = JsonConvert.DeserializeObject<List<Productos>>(jsonProductos);

            int fil = 0;
            string linea;

            foreach (Productos p in listaProductos)
            {
                //Objeto producto para rellenar la lista de productosFabrica
                Productos producto = new Productos();

                //Objeto producto para obtener el fabricado con el mismo id que el producto
                Fabricados fabricado = new Fabricados();
                foreach (Fabricados f in listaFabricados)
                {
                    if (p.Id_Articulo == f.Id_Articulo)
                    {
                        fabricado = f;
                        break;
                    }
                }

                //para definir que estilo debe llevar cada linea
                if (fil % 2 == 0)
                {
                    linea = "Par";
                } else
                {
                    linea = "Impar";
                }

                // Definimos la fila y la añadimos
                rejillaProductos.RowDefinitions.Add(new RowDefinition());

                //creacion de un objeto BitmapImage
                BitmapImage bi = new BitmapImage();
                bi.BeginInit();
                bi.UriSource = new Uri(Environment.CurrentDirectory + "/" + p.UrlImagen);
                bi.EndInit();

                //añadimos la imagen al grid
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
                lb1.Style = (Style)this.Resources[linea];
                Grid.SetRow(lb1, fil);
                Grid.SetColumn(lb1, 1);
                rejillaProductos.Children.Add(lb1);
                producto.Id_Articulo = p.Id_Articulo;

                //contenido del Descripcion
                Label lb2 = new Label();
                lb2.Content = p.Descripcion;
                lb2.Style = (Style)this.Resources[linea];
                Grid.SetRow(lb2, fil);
                Grid.SetColumn(lb2, 2);
                rejillaProductos.Children.Add(lb2);
                producto.Descripcion = p.Descripcion;

                //contenido del Stock
                Label lb3 = new Label();
                lb3.Content = p.Stock + fabricado.Cantidad;
                lb3.Style = (Style)this.Resources[linea];
                Grid.SetRow(lb3, fil);
                Grid.SetColumn(lb3, 3);
                rejillaProductos.Children.Add(lb3);
                producto.Stock = p.Stock + fabricado.Cantidad;

                //contenido del StockMinimo
                Label lb4 = new Label();
                lb4.Content = p.StockMinimo;
                lb4.Style = (Style)this.Resources[linea];
                Grid.SetRow(lb4, fil);
                Grid.SetColumn(lb4, 4);
                rejillaProductos.Children.Add(lb4);
                producto.StockMinimo = p.StockMinimo;

                //contenido del TiempoFabricacionAcumulado
                Label lb5 = new Label();
                lb5.Content = p.TiempoFabricacionAcumulado + fabricado.TiempoEmpeadoFabricacion;
                lb5.Style = (Style)this.Resources[linea];
                Grid.SetRow(lb5, fil);
                Grid.SetColumn(lb5, 5);
                rejillaProductos.Children.Add(lb5);
                producto.TiempoFabricacionAcumulado = p.TiempoFabricacionAcumulado + fabricado.TiempoEmpeadoFabricacion;


                productosFabrica.Add(producto);

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

            if (sfd.ShowDialog() == false)
            {
                MessageBox.Show("Error al guardar el archivo");
            }
            else
            {
                string path = sfd.FileName;
                string json = JsonConvert.SerializeObject(listaFabricados);
                File.WriteAllText(path, json);
            }

        }


        private void Leer_Click(object sender, RoutedEventArgs e)
        {
                string fileName = "fabricados.json"; //Ruta del archivo
                string json = File.ReadAllText(fileName); //contenido del archivo

                listaFabricados = JsonConvert.DeserializeObject<List<Fabricados>>(json);

                RegistroApuntes.ItemsSource = listaFabricados;
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
