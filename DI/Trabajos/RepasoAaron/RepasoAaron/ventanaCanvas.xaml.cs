using System;
using System.Collections.Generic;
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
    /// Lógica de interacción para ventanaCanvas.xaml
    /// </summary>
    public partial class ventanaCanvas : Window
    {

        private Point currentPoint = new Point();

        public ventanaCanvas()
        {
            InitializeComponent();
        }

        private void canvasDibujo_MouseDown(object sender, MouseButtonEventArgs e)
        {
            if (e.LeftButton == MouseButtonState.Pressed)
            {
                currentPoint = e.GetPosition(this);
            }
        }

        private void canvasDibujo_MouseMove(object sender, MouseEventArgs e)
        {
            if (e.LeftButton == MouseButtonState.Pressed)
            {
                // Crea lines
                //Line linea = new Line();
                //Brush colorLinea = new SolidColorBrush(Colors.LemonChiffon);
                //linea.Stroke = colorLinea;
                //linea.StrokeThickness = 5;

                Line linea = new Line
                {
                    Stroke = new SolidColorBrush(Colors.LemonChiffon),
                    StrokeThickness = 5
                };

                // Asigna la posicion inical
                linea.X1 = currentPoint.X;
                linea.Y1 = currentPoint.Y;

                // asigna la posicion final de la linea
                linea.X2 = e.GetPosition(this).X;
                linea.Y2 = e.GetPosition(this).Y;

                // situa el cursor en el ultimo vector que hemos dejado el cursor
                currentPoint = e.GetPosition(this);

                // Agrega la linea en el canvas
                canvasDibujo.Children.Add(linea);
            }
        }
    }
}
