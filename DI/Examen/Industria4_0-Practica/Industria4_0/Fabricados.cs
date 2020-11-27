using System;
using System.Collections.Generic;
using System.Text;

namespace Industria4_0
{
    class Fabricados
    {
        // Variables privadas de la clase
        private int id_Articulo = 0;
        private int id_ProcesoFabricacion = 0;
        private string fecha = "";
        private string hora = "";
        private float tiempoEmpeadoFabricacion = 0f;
        private int cantidad = 0;
        // Propieades
        public int Id_Articulo
        {
            get { return id_Articulo; }
            set { id_Articulo = value; }
        }
        public int Id_ProcesoFabricacion
        {
            get { return id_ProcesoFabricacion; }
            set { id_ProcesoFabricacion = value; }
        }

        public string Fecha
        {
            get { return fecha; }
            set { fecha = value; }
        }
        public string Hora
        {
            get { return hora; }
            set { fecha = hora; }
        }

        public float TiempoEmpeadoFabricacion
        {
            get { return tiempoEmpeadoFabricacion; }
            set { tiempoEmpeadoFabricacion = value; }
        }
        public int Cantidad
        {
            get { return cantidad; }
            set { cantidad = value; }
        }
    }
}
