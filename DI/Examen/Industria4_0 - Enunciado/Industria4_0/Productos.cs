using System;
using System.Collections.Generic;
using System.Text;

namespace Industria4_0
{
    class Productos
    {
        private string id_Articulo = "";
        private string descripcion = "";
        private string urlImagen = "";
        private int stock = 0;
        private int stockMinimo = 0;
        private float tiempoFabricacionAcumulado = 0;

        public string Id_Articulo { get => id_Articulo; set => id_Articulo = value; }
        public string Descripcion { get => descripcion; set => descripcion = value; }
        public string UrlImagen { get => urlImagen; set => urlImagen = value; }
        public int Stock { get => stock; set => stock = value; }
        public int StockMinimo { get => stockMinimo; set => stockMinimo = value; }
        public float TiempoFabricacionAcumulado { get => tiempoFabricacionAcumulado; set => tiempoFabricacionAcumulado = value; }
    }
}
