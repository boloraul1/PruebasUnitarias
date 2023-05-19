/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package pruebasunitarias;

import java.util.NoSuchElementException;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author bolor
 */
public class ClaseExamenNGTest {

    public ClaseExamenNGTest() {

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getMaximo method, of class ClaseExamen.
     */
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testConstructorNull() {
        int[] datos = null;
        new ClaseExamen(datos);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testConstructorVacio() {
        int[] datos = new int[0];
        new ClaseExamen(datos);
    }

    @Test
    public void testConstructorBien() {
        int[] datos = new int[]{10, 1, 20, 2, 25, 65, 125, 12, 31, 85, 78, 31, 89, 67, 95, 98};
        new ClaseExamen(datos);
    }

    @Test
    public void testGetMaximo() {
        Integer[] prueba = {10, 1, 20, 2, 25, 65, 125, 12, 31, 85, 78, 31, 89, 67, 95, 98};
        int[] datos = new int[prueba.length];
        for (int i = 0; i < prueba.length; i++) {
            datos[i] = prueba[i];
        }
        ClaseExamen operaciones = new ClaseExamen(datos);
        int result = operaciones.getMaximo();
        int expResult = 125;
        assertEquals(result, expResult);
    }

    /**
     * Test of getMinimo method, of class ClaseExamen.
     */
    @Test
    public void testGetMinimo() {
        Integer[] prueba = {10, 1, 20, 2, 25, 65, 125, 12, 31, 85, 78, 31, 89, 67, 95, 98};
        int[] datos = new int[prueba.length];
        for (int i = 0; i < prueba.length; i++) {
            datos[i] = prueba[i];
        }
        ClaseExamen operaciones = new ClaseExamen(datos);
        int result = operaciones.getMinimo();
        int expResult = 1;
        assertEquals(result, expResult);
    }

    /**
     * Test of getSuma method, of class ClaseExamen.
     */
    @Test
    public void testGetSuma() {
        Integer[] prueba = {10, 1, 20, 2, 25, 65, 125, 12, 31, 85, 78, 31, 89, 67, 95, 98};
        int[] datos = new int[prueba.length];
        for (int i = 0; i < prueba.length; i++) {
            datos[i] = prueba[i];
        }
        ClaseExamen operaciones = new ClaseExamen(datos);
        int result = operaciones.getSuma();
        int expResult = 834;
        assertEquals(result, expResult);
    }

    /**
     * Test of getIndiceDe method, of class ClaseExamen.
     */
    @Test
    public void testGetIndiceDe2() {
        Integer[] prueba = {10, 1, 20, 2, 25, 65, 125, 12, 31, 85, 78, 31, 89, 67, 95, 98};
        int[] datos = new int[prueba.length];
        for (int i = 0; i < prueba.length; i++) {
            datos[i] = prueba[i];
        }
        ClaseExamen operaciones = new ClaseExamen(datos);
        int result = operaciones.getIndiceDe(2);
        int expResult = 3;
        assertEquals(result, expResult);
    }

    @Test (expectedExceptions = NoSuchElementException.class)
    public void testGetIndiceDe169() {
        Integer[] prueba = {10, 1, 20, 2, 25, 65, 125, 12, 31, 85, 78, 31, 89, 67, 95, 98};
        int[] datos = new int[prueba.length];
        for (int i = 0; i < prueba.length; i++) {
            datos[i] = prueba[i];
        }
        ClaseExamen operaciones = new ClaseExamen(datos);
        operaciones.getIndiceDe(169);
    }

}
