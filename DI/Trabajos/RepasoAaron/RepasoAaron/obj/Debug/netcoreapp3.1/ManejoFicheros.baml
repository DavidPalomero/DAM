   M S B A M L   `   `   `  ����F  BRepasoAaron, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null)clr-namespace:RepasoAaronRepasoAaron  5   	        RepasoAaron.ManejoFicheros   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35e aSystem.Windows.Controls.Ribbon, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35F 9http://schemas.microsoft.com/winfx/2006/xaml/presentation     5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   b ^MaterialDesignThemes.Wpf, Version=3.2.0.1979, Culture=neutral, PublicKeyToken=df2a72020bd7962aFmaterialDesign1http://materialdesigninxaml.net/winfx/xaml/themes  5   	   %localclr-namespace:RepasoAaron  5   	   -   5          � Title$  ManejoFicheros��5	   	   $	��450��6    $	��800��6-    � 
ResizeMode$ NoResize=�5
   	    � 	Resources 5       �� 
TargetType   styRich �� Property �� Value  
comGuardar �� Text �� InputGestures  cerrarVentana  archivoNuevo  	comborrar��%�  &	        &	 y     &	 �     &	     &	 `    �� 5   
   " ��6   .�5      ��  � ��$ 25, 10, 50, 30q�6(   �� 5       � ��$	 415��6'   5      �� 5   
   $  ��6-    5      ��5      
CTRL+s��6%   5      �� 5   
   $  ��60    5      ��5      ESC��6"   5      �� 5   
   $  ��6/    5      ��5       
CTRL+n��6%   5"      �� 5#   
   $  ��6,    5$      ��5%      
CTRL+b��6%   5'      5(       J� CommandBindings 5+      )  #System.Windows.Input.CommandBinding  5,   
   -   5        	   Command#	 [ 5,      6?     5-   
   -   5        #	 [ 5-      6B     5.   
   -   5        #	 [ 5.      6A     5/   
   -   5        #	 [ 5/      6>   .��52      �� .+�53   
   o� .@�54      m� 
 m� Command#
 [ 6I   ��6   0  *MaterialDesignThemes.Wpf.PackIconExtension     Kind$ 	Hamburger=�6I   m� 55      $��Borrar��6   #
 [ 6'   m� 56      $��Abrir��6   m� 57      $��Nuevo��6   #
 [ 6&   58      �� 5;   
   -   5         ��Name$ editorTexto��5;      #��[  6+   . �5<      /� .T�5=      J� .*�6   .*�5>      �� .�6   Pipo6    5?      5@      5A      5B      5C      