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
using Newtonsoft.Json;

namespace RepasoAaron
{
    public partial class ManejoJSON : Window
    {
        //necesario para el Json
        List<Pokemones> listaPokemones = new List<Pokemones>();
        string rutaJson = "/../../../res";
        string rutaImg = "/../../../res/Pokemons/";

        public ManejoJSON()
        {
            InitializeComponent();
        }

        // Abrir un fichero JSON y rellenar un DataGrid
     
        private void Window_Loaded(object sender, RoutedEventArgs e)
        {
            string filemone = Environment.CurrentDirectory + rutaJson + "/pokemones.json";
            string json = File.ReadAllText(filemone); //contenido del archivo

            listaPokemones = JsonConvert.DeserializeObject<List<Pokemones>>(json);

            dgJson.ItemsSource = listaPokemones;

            /*
             * Seleecionar fichero
            OpenFileDialog dlg = new OpenFileDialog {Filter = "Fichero JSON|*.json"};

            if (dlg.ShowDialog() == true)
            {
                string filemone = dlg.FileName; //Ruta del archivo
                string json = File.ReadAllText(filemone); //contenido del archivo

                listaPokemones = JsonConvert.DeserializeObject<List<Pokemones>>(json);

                dgJson.ItemsSource = listaPokemones;
            }
            */
        }



        private void mostrarDatosPokemon(object sender, MouseButtonEventArgs e)
        {

            limpiarRegistros();

            //obtener datos que se va a pintar
            DataGrid dg = (DataGrid)sender;
            Pokemones registro = (Pokemones)dgJson.SelectedItems[0];

            //Obtener la imagen del registro
            BitmapImage bi = new BitmapImage();
            bi.BeginInit();
            bi.UriSource = new Uri(Environment.CurrentDirectory + rutaImg + registro.Imagen);
            bi.EndInit();

            //Añade la imagen al grid
            imgRegistro.Children.Add(new Image { Source = bi, Stretch = Stretch.Fill });

            //rellena los textBox
            nPokedex.Text = registro.NPokedex;
            nombre.Text = registro.Nombre;
            tipo1.Text = registro.Tipo1;
            tipo2.Text = registro.Tipo2;

            gridDatosRegistro.Visibility = Visibility.Visible;
        }

        public void limpiarRegistros()
        {
            imgRegistro.Children.Clear();
            nPokedex.Text = "";
            nombre.Text = "";
            tipo1.Text = "";
            tipo2.Text = "";
        }

        private void cerrarRegistro_Click(object sender, RoutedEventArgs e)
        {
            gridDatosRegistro.Visibility = Visibility.Hidden;
            limpiarRegistros();
        }
    }
}
