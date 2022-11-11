import java.util.Arrays;
import javax.swing.JOptionPane;
public class Jhonmen {
public static void main(String[] args) {

int i,alumnos;

int superior = 0, inferior= 0;

double aux;

int min;

int superior2 = 0,inferior2= 0;;

double media = 0,media2=0;

String nombre ;

alumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de alumnos : " ));

double[] alto = new double[alumnos];

double[] peso = new double[alumnos];

for (i = 0; i < alumnos; i++) {

nombre= JOptionPane.showInputDialog("Nombre del alumno " );

alto[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura en (m) del alumno "+nombre));

media = media + alto[i];

peso[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso en (kg) del alumno " +nombre));

peso[i]=(peso[i]*2.2);

media2 = media2 + peso[i];

}

media = media / alumnos;

media2 =media2 / alumnos;

for (i = 0; i < alto.length; i++) {

if (alto[i] > media){

superior++;

} else if (alto[i] < media){

inferior++;

}

}

for (i = 0; i < peso.length; i++) {

if (peso[i] > media2){

superior2++;

} else if (peso[i] < media2){

inferior2++;

}

}

for(i=0;i<alumnos-1;i++) {

min=i;

for(int j=i+1;j<alumnos;j++){

if(alto[j]<alto[min]){

min=j;

}

}

if(i!=min){

aux =alto[i];

alto[i]=alto[min];

alto[min] = aux;}

}

for(i=0;i<alumnos-1;i++) {

min=i;

for(int j=i+1;j<alumnos;j++){

if(peso[j]<peso[min]){

min=j;

}

}

if(i!=min){

aux =peso[i];

peso[i]=peso[min];

peso[min] = aux;}

}


JOptionPane.showMessageDialog(null,"Orden de la altura de los estudiantes" +Arrays.toString(alto));

JOptionPane.showMessageDialog(null,"Orden de peso de los estudiantes" +Arrays.toString(peso));


JOptionPane.showMessageDialog(null,"Estatura media: " + media+"m");

JOptionPane.showMessageDialog(null,"Peso medio: " + media2+"lb");

JOptionPane.showMessageDialog(null,"Personas con estatura superior a la media: " + superior);

JOptionPane.showMessageDialog(null,"Personas con peso superior a la media: " + superior2);

JOptionPane.showMessageDialog(null,"Personas con ´estatura inferior a la media: " + inferior);

JOptionPane.showMessageDialog(null,"Personas con peso inferior a la media: " + inferior2);

}

}