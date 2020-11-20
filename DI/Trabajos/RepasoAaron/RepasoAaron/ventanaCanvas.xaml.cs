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
        String urlImg = "/../../../res/Pokemons/";

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

        /// <summary>Crea una imagen canvas en el lienzo y le asigna propiedades para poder moverla</summary>
        /// <param name="sender">Objeto que ejecuta la accion</param>
        /// <param name="e">Objeto evento</param>
        private void MenuItem_Click_1(object sender, RoutedEventArgs e)
        {

            //changeColorMenu((MenuItem)sender);

            // Creamos el canvas
            Canvas c1 = new Canvas();

            // Creamos el bitmap de la imagen
            BitmapImage bi = new BitmapImage();
            bi.BeginInit();
            bi.UriSource = new Uri(urlImg + "Squirtle.png");
            bi.EndInit();

            // Creamos la imagen y le damos propiedades
            Image img = new Image { Source = bi, Stretch = Stretch.Fill, Height = 50, Width = 50 };

            // Agrega la imagen al canvas
            c1.Children.Add(img);

            c1.MouseLeftButtonDown += new MouseButtonEventHandler(Canvas_MouseLeftButtonDown);
            c1.MouseLeftButtonUp += new MouseButtonEventHandler(Canvas_MouseLeftButtonUp);
            c1.MouseMove += new MouseEventHandler(Canvas_MouseMove);

            // Asignar la posicion del canvas que vamos a agregar
            Canvas.SetLeft(c1, 50);
            Canvas.SetTop(c1, 50);

            // Agregamos el canvas nuevo al canvas base
            canvasDibujo.Children.Add(c1);
        }

        /// <summary>Crea una captura de raton en un evento canvas cuando lo pulsamos</summary>
        /// <param name="sender">Objeto que ejecuta la accion</param>
        /// <param name="e">Objeto evento</param>
        private void Canvas_MouseLeftButtonDown(object sender, MouseButtonEventArgs e)
        {

            Canvas layer1 = (Canvas)sender;
            if (layer1 != null) { layer1.CaptureMouse(); }
        }

        /// <summary>Para la captura de raton en un evento canvas cuando lo pulsamos</summary>
        /// <param name="sender">Objeto que ejecuta la accion</param>
        /// <param name="e">Objeto evento</param>
        private void Canvas_MouseLeftButtonUp(object sender, MouseButtonEventArgs e)
        {

            Canvas layer1 = (Canvas)sender;
            if (layer1 != null) { layer1.ReleaseMouseCapture(); }
        }

        /// <summary>Desplaza la imagen canvas por el lienzo</summary>
        /// <param name="sender">Objeto que ejecuta la accion</param>
        /// <param name="e">Objeto evento</param>
        private void Canvas_MouseMove(object sender, MouseEventArgs e)
        {

            Canvas layer1 = (Canvas)sender;

            if (layer1 != null && layer1.IsMouseCaptured)
            {

                currentPoint = e.GetPosition(this);
                Canvas.SetLeft(layer1, currentPoint.X);
                Canvas.SetTop(layer1, currentPoint.Y);
            }
        }
    }
}

