/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okumura.proyectolibroclases;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Okumura
 */
public class poblamientoDatos {
    public static void main(String [] args) throws FileNotFoundException{
        Colegio colegio = new Colegio();
        colegio.setCursos(new ArrayList<Curso>());
        String [] nombresM = readData("listaM.txt",50);
        String [] nombresH = readData("listaH.txt",50);
        String [] apellidos = readData("apellidos.txt",100);
        System.out.println(nombresM.length+" "+nombresH.length+" "+apellidos.length);
        
        int curso = 1;
        int letra = 0;
        String letraCurso = "A";
        Curso temp = null;
        Double [] notas = new Double [5];
        boolean [][] asistencia = new boolean[4][5];
        
        for(int i = 0; i<16;i++){
            if(letra == 0){
                letraCurso = "A";
                temp = new Curso(curso,letraCurso);
                letra++;
            }else {
                letraCurso = "B";
                letra--;
                temp = new Curso(curso,letraCurso);
                curso++;
            }
            
            temp.setlistaAlumnos(new ArrayList<Alumno>());
            
            Random rnd=new Random();
            Random ran=new Random();
            int max = 99;
            int n = 50;
            int sex = 2;
            String nombre;
            String nombreAp;
            for(int j = 0; j<30;j++){
                if(rnd.nextInt(sex)==0){
                    nombre = apellidos[rnd.nextInt(max)] +" "+ apellidos[rnd.nextInt(max)] +" " +nombresH[(int) Math.floor(Math.random() * 50)];
                }else{
                    nombre = apellidos[rnd.nextInt(max)] +" "+ apellidos[rnd.nextInt(max)] +" " +nombresM[(int) Math.floor(Math.random() * 50)];
                }
                if(rnd.nextInt(sex)==0){
                    nombreAp = apellidos[rnd.nextInt(max)] +" "+ apellidos[rnd.nextInt(max)] +" " +nombresH[(int) Math.floor(Math.random() * 50)];
                }else{
                    nombreAp = apellidos[rnd.nextInt(max)] +" "+ apellidos[rnd.nextInt(max)] +" " +nombresM[(int) Math.floor(Math.random() * 50)];
                } 
                Alumno temp3 = new Alumno(nombreAp, nombre);
                temp3.setNotas(new ArrayList<Notas>());
                String [] asig = {"Lenguaje","Matematicas","Historia","Ingles","Educacion Fisica"};
                Notas not = null;
                for(int h = 0; h<5;h++){
                    not = new Notas(asig[h]);
                    for(int k = 0;k<5;k++){
                        notas[k] = 1.0 + (Double) Math.floor(Math.random() * 6);
                    }
                    not.setNotas(notas);
                    temp3.getNotas().add(not);
                }
                
                temp3.setAsistencia(new ArrayList<Asistencia>());
                String [] mes = {"Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
                Asistencia asist = null;
                for(int g=0;g<10;g++){
                    asist = new Asistencia(mes[g]);
                    for(int h = 0; h<4;h++){
                        for(int k = 0;k<5;k++){
                            asistencia[h][k] = Math.random() < 0.5 ? true : false;
                        }
                    }
                    asist.setAsistencia(asistencia);
                    temp3.getAsistencia().add(asist);
                }
                
               
                
                temp.getlistaAlumnos().add(temp3);
                	   
            }
            Collections.sort(temp.getlistaAlumnos());
            colegio.getCursos().add(temp);
            //temp.setlistaAlumnos();
            

        }
        
            String arch = "colegio.xml";
            try {

		File file = new File(arch);
		JAXBContext jaxbContext = JAXBContext.newInstance(Alumno.class,Profesor.class,Curso.class,Colegio.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.marshal(colegio, file);
                
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                Colegio xml = (Colegio) jaxbUnmarshaller.unmarshal(file);
                System.out.println(xml.getCursos().size());

	      } catch (JAXBException e) {
		e.printStackTrace();
	      }        

    }

  
    
    
    
    
    
    public static String [] readData(String file,int n){
        File fichero = new File(file);
		Scanner s = null;
                String [] datos = new String [n];
                int cont = 0;

		try {
			s = new Scanner(fichero);
                        
			while (s.hasNextLine()) {
				String linea = s.nextLine();
                                datos[cont] = (linea);
                                cont++;
			}

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
        return datos.clone();
    }
}
