   M S B A M L   `   `   `  ����G  CIndustria4_0, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null+clr-namespace:Industria4_0Industria4_0  5   	       Industria4_0.MainWindow   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35e aSystem.Windows.Controls.Ribbon, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35F 9http://schemas.microsoft.com/winfx/2006/xaml/presentation     5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   b ^MaterialDesignThemes.Wpf, Version=4.0.0.2273, Culture=neutral, PublicKeyToken=df2a72020bd7962aFmaterialDesign1http://materialdesigninxaml.net/winfx/xaml/themes  5   	   &localclr-namespace:Industria4_0  5   	     � Title$  Industia 4.0��5
   	   $	��886��6   $
��1288��6+    � 	Resources 5       �� 
TargetType   Par �� Property �� Value 	 Impar  styMenu  styBoton  styCabecera  styLabel��%z  &	        &	 P     &	 �     &	 �     &	 Z    &	 �    �� 5   
   " ��6   .�5      ��  � �� �	#FFA5E6D763   5      �� 5   
   " ��6   .�5      ��  � �� �	#FFA0D48D63   5      �� 5   
   " c�6   .�5      ��  � ��
 ���f�6+   5      �� 5   
   " ��6   .�5      ��  � ��
 ���f�6+   �� 5       � ��$
 15,0q�6'   5      �� 5   
   " ��6   .�5      ��  � ��
 ��� �6+   5      �� 5    
   " ��6   .�5!      ��  � ��$
 Bold"�6+   �� 5"       � ��$ Center=�62   �� 5#       � ��$ Center=�6;   5%      5&      .��5(      � $��	0,0,10,27q�6    � ColumnDefinitions 5)   
   �� 5*      $
��437* �6   �� 5+      $
��119* �6    � RowDefinitions 5-   
   �� 5.      $	��89* �6   �� 5/      $	��91* �6   �� 50      $
��663* �6   .+�55   
   &   System.Windows.Controls.DataGrid  -   5          Name$ RegistroApuntes��55   i      AutoGenerateColumns$ False��66   	   CanUserAddRows$	 False��6R   $��Center=�6�   $	��823��6�   $��0,10,0,0q�6�   $	��Top=�6�   $	��219��6�   $��1��6�   $��0��6�   $��3��6�   ��6   �� *
fabricados+
   Columns
 56      0  *System.Windows.Controls.DataGridTextColumn  57      ,  &System.Windows.Controls.DataGridColumn   Header$    ID_Articulo��6%      Width5  /System.Windows.Controls.DataGridLengthConverter$ * 6=   1  +System.Windows.Controls.DataGridBoundColumn   Binding 6G   �� *Id_Articulo+   HeaderStyle 58      �� 59      =  7System.Windows.Controls.Primitives.DataGridColumnHeader"  6    .�5:      ��  � �� �	#FFEE63136;   �� 5;       � ��
 �����6;   �� 5<       � ��$ 12(�69   �� 5=       � ��$ 0,0,5,0q�67   5>      5A        5B      $ 	 Cantidad��6&   $ * 6:    6D   �� *
Cantidad+ 5C      �� 5D      "  6    .�5E      ��  � �� �	#FFEE63136;   �� 5F       � ��
 �����6;   �� 5G       � ��$ 12(�69   �� 5H       � ��$ 5, 0,0,0q�67   5I      5K      5N      c� 5O   
   $��Center=�6   $	��103��6/   $��Center=�6<   $
��1020��6W   #��[ 6d   .@�5P      �� -   5         ��Name$
 Leer��5P      $	��102��6#   $	��108��60   $��Stretch=�6<   #��[ 6k   ��5Q      '  !MaterialDesignThemes.Wpf.PackIcon  5R         Kind$ Factory=�6.   $��80��6=   $��80��6H   5T      �� 5U      -   5        $ GrabarFichero��5U   M   $��Stretch=�6   $	��102��64   $	��108��6A   $
��Left=�6�   #��[ 6�   ��5V        5W      $ ContentSave=�6.   $��80��6A   $��80��6L   5Y      �� 5Z      -   5        $ Salir��5Z      $	��102��6&   $	��108��63   $��Stretch=�6?   #��[ 6o   ��5[        5\      $ 	ExitToApp=�6.   $��80��6?   $��80��6J   5^      5_      �� 5`   
   #��[ 6   $��Center=�6:   $��1��6W    �� Orientation$ 
Horizontal=�6g   $��0,7,0,45q�6�   $
��1020��6�   .+�5c      �� $��Imagen��6   $	��125��6%   #��[ 61   �� 5d      $��IdArt.��6   $	��112��6%   #��[ 61   �� 5e      $��Descripción��6   $	��345��6*    J� RenderTransformOrigin$ 0.508,1.288&�66   #��[ 6Z   �� 5f      $
��Stok��6   $	��130��6#   #��[ 6/   �� 5g      $��
Sto.Minimo��6   $	��177��6)   #��[ 65   �� 5h      $��Tiempo.Fabric.��6   $	��126��6-   #��[ 69   5i      � 5j   
   -   5         �Name$ rejillaProductos��5j   %    � ShowGridLines$
 True��6   $��Center=�6?   $	��661��6\   $��0,51,0,0q�6i   $��1��6{   $	��Top=�6�   $
��1005��6�   $��2��6�    5k      �� 5l      $��125.4 �6#   �� 5m      $	��80* �6#   �� 5n      $	��378 �6#   �� 5o      $
��103* �6#   �� 5p      $
��176* �6#   �� 5q      $
��143* �6#   5s      5t      5u      