﻿#pragma checksum "..\..\..\ManejoJSON.xaml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "87708CD9845D13FC8D10145B3EB82F3ECE1A0762"
//------------------------------------------------------------------------------
// <auto-generated>
//     Este código fue generado por una herramienta.
//     Versión de runtime:4.0.30319.42000
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código.
// </auto-generated>
//------------------------------------------------------------------------------

using RepasoAaron;
using System;
using System.Diagnostics;
using System.Windows;
using System.Windows.Automation;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Controls.Ribbon;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Media.Effects;
using System.Windows.Media.Imaging;
using System.Windows.Media.Media3D;
using System.Windows.Media.TextFormatting;
using System.Windows.Navigation;
using System.Windows.Shapes;
using System.Windows.Shell;


namespace RepasoAaron {
    
    
    /// <summary>
    /// ManejoJSON
    /// </summary>
    public partial class ManejoJSON : System.Windows.Window, System.Windows.Markup.IComponentConnector {
        
        
        #line 31 "..\..\..\ManejoJSON.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.DataGrid dgJson;
        
        #line default
        #line hidden
        
        
        #line 37 "..\..\..\ManejoJSON.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Grid gridDatosRegistro;
        
        #line default
        #line hidden
        
        
        #line 56 "..\..\..\ManejoJSON.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBox nPokedex;
        
        #line default
        #line hidden
        
        
        #line 61 "..\..\..\ManejoJSON.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBox nombre;
        
        #line default
        #line hidden
        
        
        #line 66 "..\..\..\ManejoJSON.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBox tipo1;
        
        #line default
        #line hidden
        
        
        #line 71 "..\..\..\ManejoJSON.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBox tipo2;
        
        #line default
        #line hidden
        
        
        #line 81 "..\..\..\ManejoJSON.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Grid imgRegistro;
        
        #line default
        #line hidden
        
        
        #line 87 "..\..\..\ManejoJSON.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button cerrarRegistro;
        
        #line default
        #line hidden
        
        private bool _contentLoaded;
        
        /// <summary>
        /// InitializeComponent
        /// </summary>
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "4.8.1.0")]
        public void InitializeComponent() {
            if (_contentLoaded) {
                return;
            }
            _contentLoaded = true;
            System.Uri resourceLocater = new System.Uri("/RepasoAaron;V1.0.0.0;component/manejojson.xaml", System.UriKind.Relative);
            
            #line 1 "..\..\..\ManejoJSON.xaml"
            System.Windows.Application.LoadComponent(this, resourceLocater);
            
            #line default
            #line hidden
        }
        
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "4.8.1.0")]
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Never)]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Design", "CA1033:InterfaceMethodsShouldBeCallableByChildTypes")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Maintainability", "CA1502:AvoidExcessiveComplexity")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1800:DoNotCastUnnecessarily")]
        void System.Windows.Markup.IComponentConnector.Connect(int connectionId, object target) {
            switch (connectionId)
            {
            case 1:
            
            #line 8 "..\..\..\ManejoJSON.xaml"
            ((RepasoAaron.ManejoJSON)(target)).Loaded += new System.Windows.RoutedEventHandler(this.Window_Loaded);
            
            #line default
            #line hidden
            return;
            case 2:
            this.dgJson = ((System.Windows.Controls.DataGrid)(target));
            
            #line 31 "..\..\..\ManejoJSON.xaml"
            this.dgJson.MouseLeftButtonUp += new System.Windows.Input.MouseButtonEventHandler(this.mostrarDatosPokemon);
            
            #line default
            #line hidden
            return;
            case 3:
            this.gridDatosRegistro = ((System.Windows.Controls.Grid)(target));
            return;
            case 4:
            this.nPokedex = ((System.Windows.Controls.TextBox)(target));
            return;
            case 5:
            this.nombre = ((System.Windows.Controls.TextBox)(target));
            return;
            case 6:
            this.tipo1 = ((System.Windows.Controls.TextBox)(target));
            return;
            case 7:
            this.tipo2 = ((System.Windows.Controls.TextBox)(target));
            return;
            case 8:
            this.imgRegistro = ((System.Windows.Controls.Grid)(target));
            return;
            case 9:
            this.cerrarRegistro = ((System.Windows.Controls.Button)(target));
            
            #line 87 "..\..\..\ManejoJSON.xaml"
            this.cerrarRegistro.Click += new System.Windows.RoutedEventHandler(this.cerrarRegistro_Click);
            
            #line default
            #line hidden
            return;
            }
            this._contentLoaded = true;
        }
    }
}

