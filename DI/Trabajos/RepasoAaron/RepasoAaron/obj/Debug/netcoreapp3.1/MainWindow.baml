   M S B A M L   `   `   `  ����F  BRepasoAaron, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null)clr-namespace:RepasoAaronRepasoAaron  5   	       RepasoAaron.MainWindow   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35e aSystem.Windows.Controls.Ribbon, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35F 9http://schemas.microsoft.com/winfx/2006/xaml/presentation     5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   b ^MaterialDesignThemes.Wpf, Version=3.2.0.1979, Culture=neutral, PublicKeyToken=df2a72020bd7962aFmaterialDesign1http://materialdesigninxaml.net/winfx/xaml/themes  5   	   %localclr-namespace:RepasoAaron  5   	     � Title$  
MainWindow��5	   	   $	��450��6   $	��800��6)    � 	Resources 5       �� 
TargetType   boton_heredar �� Property �� Value  	styleBtn1 �� BasedOn  WindowStyle��%]  &	        &	 n     7   &	 �     '��     7   �� 5   
   " ��6   .�5      ��  � ��$	 100��6'   �� 5       � ��$	 300��6&   5      �� 5   
   " ��6   8   .�5      ��  � ��
 ����6+   5      �� 5   
   " �6   .�5      ��  � ��
 �����6+   5      �� 5   
   " ��6   8   5      5      .��5      �  � ColumnDefinitions 5   
   �� 5      $��* �6   �� 5      $��* �6    � RowDefinitions 5    
   �� 5!      �� 5"      .+�5&   
   �� -   5         ��Name$
 bnt1��5&      #��[ 6   $��Abrir ventana 1��5'   =   $��0��5(   #   $��0��5)   )   5*      �� 5-   
   -   5        $
 bnt2��5-      $��Abrir ventana 2��5.   =   $��0��5/   #   $��1��50   )   51      �� 54   
   -   5        $
 btn3��54      $��Cambiar Estilo��55   <   $��1��56   #   $��0��57   )   58      �� 5;   
   -   5        $
 btn4��5;      ��5<      '  !MaterialDesignThemes.Wpf.PackIcon  5=      	   Kind$
	 File=�6*   $��80��66   $��80��6A   $��1��5?   #   $��1��5@   )   5A      5B      5C      