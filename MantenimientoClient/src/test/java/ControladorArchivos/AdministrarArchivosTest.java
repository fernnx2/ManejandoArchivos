/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorArchivos;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojos.Equipo;

/**
 *
 * @author fernando
 */
public class AdministrarArchivosTest {
    
    public AdministrarArchivosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validar method, of class AdministrarArchivos.
     */
    @Test
    public void testValidar() {
        System.out.println("validar");
        String path = "src/test/resources/data.csv";
        AdministrarArchivos instance = new AdministrarArchivos();
        boolean expResult = true;
        boolean result = instance.validar(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of validarPerimisos method, of class AdministrarArchivos.
     */
    @Test
    public void testValidarPerimisos() {
        System.out.println("validarPerimisos");
        String path = "src/test/resources/data.csv";
        AdministrarArchivos instance = new AdministrarArchivos();
        boolean expResult = true;
        boolean result = instance.validarPerimisos(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of validarDirectorio method, of class AdministrarArchivos.
     */
    @Test
    public void testValidarDirectorio() {
        System.out.println("validarDirectorio");
        String path = "src/test/resources";
        AdministrarArchivos instance = new AdministrarArchivos();
        boolean expResult = true;
        boolean result = instance.validarDirectorio(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of leer_archivo method, of class AdministrarArchivos.
     */
    @Test
    public void testLeer_archivo() {
        System.out.println("leer_archivo");
        String path = "src/test/resources/data.csv";
        AdministrarArchivos instance = new AdministrarArchivos();
        List<String> expResult= new ArrayList();
        expResult.add("historico,No inventario,Marca,serie,Modelo,Responsable,Sistema Operativo,Version,Licencia,observaciones");
        expResult.add("HCE1,12040.3301.080.0090,Dell,3W36JLI,Optiplex 780,Lic.Hugo Edgardo Garcia,Windows,7 Profesional 32,no,Office Pirata");
        expResult.add("HCE2,12040.3301.080.0080,Dell,JW36JL1,Optiplex 780,Lic. Francisco,Windows,7 ultimate 32,si,Monitor");
        List<String> result = instance.leer_archivo(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of convertirArchivo method, of class AdministrarArchivos.
     */
    @Test
    public void testConvertirArchivo() {
        System.out.println("convertirArchivo");
        List<String> data = new ArrayList();
        data.add("historico,No inventario,Marca,serie,Modelo,Responsable,Sistema Operativo,Version,Licencia,observaciones");
        data.add("HCE1,12040.3301.080.0090,Dell,3W36JLI,Optiplex 780,Lic.Hugo Edgardo Garcia,Windows,7 Profesional 32,no,Office Pirata");
        data.add("HCE2,12040.3301.080.0080,Dell,JW36JL1,Optiplex 780,Lic. Francisco,Windows,7 ultimate 32,si,Monitor");
        AdministrarArchivos instance = new AdministrarArchivos();
        List<Equipo> expResult = new ArrayList();
        Equipo e1 = new Equipo("historico","No inventario","Marca","serie","Modelo","Responsable","Sistema Operativo","Version","Licencia","observaciones");
        Equipo e2 = new Equipo("HCE1","12040.3301.080.0090","Dell","3W36JLI","Optiplex 780","Lic.Hugo Edgardo Garcia","Windows","7 Profesional 32","no","Office Pirata");
        Equipo e3 = new Equipo("HCE2","12040.3301.080.0080","Dell","JW36JL1","Optiplex 780","Lic. Francisco","Windows","7 ultimate 32","si","Monitor");
        expResult.add(e1);
        expResult.add(e2);
        expResult.add(e3);
        List<Equipo> result = instance.convertirArchivo(data);
       
        assertEquals(expResult.get(0).getnSerie(), result.get(0).getnSerie());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
