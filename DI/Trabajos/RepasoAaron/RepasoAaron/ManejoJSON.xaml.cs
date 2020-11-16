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
        string ruta = "/../../../res";

        public ManejoJSON()
        {
            InitializeComponent();
        }

        // Abrir un fichero JSON y rellenar un DataGrid
     
        private void Window_Loaded(object sender, RoutedEventArgs e)
        {
            string filemone = Environment.CurrentDirectory + ruta + "/pokemones.json";
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

        }
    }
}
