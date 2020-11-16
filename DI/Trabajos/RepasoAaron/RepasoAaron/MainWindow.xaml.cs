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

        private void bnt1_Click(object sender, RoutedEventArgs e)
        {
            //Instancia de la venta que abre el boton
            ManejoJSON w1 = new ManejoJSON();
            w1.Show();
        }

        private void bnt2_Click(object sender, RoutedEventArgs e)
        {

        }
    }
}
