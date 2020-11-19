using System;
using System.Collections.Generic;
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

namespace RepasoAaron
{
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        /// <summary>Abre una ventana para el manejo con Json</summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void bnt1_Click(object sender, RoutedEventArgs e)
        {
            //Instancia de la venta que abre el boton
            ManejoJSON w1 = new ManejoJSON();
            w1.Show();
        }

        /// <summary>Abre una ventana para el canvas</summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void bnt2_Click(object sender, RoutedEventArgs e)
        {
            ventanaCanvas vc = new ventanaCanvas();
            vc.ShowDialog();
        }

        private void btn3_Click(object sender, RoutedEventArgs e)
        {
            
            this.Style = (Style)this.Resources["WindowStyle"];

            Button boton = (Button)sender;
            /*
            Style st = (Style)App.Current.Resources["estiloBotones"];
            string res = (boton.Style == st) ? "herBoton" : "estiloBotones"; 
            boton.Style = (Style)App.Current.Resources[res];
            */
            boton.Style = (Style)App.Current.Resources[(boton.Style == (Style)App.Current.Resources["estiloBotones"]) ? "herBoton" : "estiloBotones"];
        }

        private void btn4_Click(object sender, RoutedEventArgs e)
        {
            ManejoFicheros w = new ManejoFicheros();
            w.Show();
        }
    }
}
