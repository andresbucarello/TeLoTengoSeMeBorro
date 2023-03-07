/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepa1;


/**
 *
 * @author andresbucarello
 */

public class GrafoAmazon{
    int numVerts;
    static int maxVerts = 20; 
    Vertice [] verts;
    int [][] matAd;
    
    public GrafoAmazon(){
        GrafoAmazon.maxVerts=maxVerts; 
    }
    
    public GrafoAmazon(int mx){
        matAd = new int [mx][mx]; 
        verts = new Vertice[mx]; 
        for (int i = 0; i < mx; i++)
            for (int j = 0; j < mx; j++)
                System.out.println(matAd[i][j] = 0);
                
        
        numVerts=0;
    }
    
    public void nuevoVertice (String nom){ 
        boolean esta = numVertice(nom) >= 0;
        if (!esta){
            Vertice v = new Vertice(nom);
            v.asigVert(numVerts);
            verts[numVerts++]=v;
        } 
    }
    
    public int numVertice(String vs){
        Vertice v = new Vertice(vs);
        boolean encontrado = false;
        int i = 0;
        for (; (i < numVerts) && !encontrado;){
            encontrado = verts[i].equals(v); 
            if (!encontrado) i++ ;
        } 
        return (i < numVerts) ? i : -1 ;
    }
    
    public void nuevoArco(String a, String b)throws Exception{ // El método recibe el nombre de cada vértice del arco, busca, en el array, el número de vértice asignado a cada uno de ellos y marca la matriz de adyacencia.
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
        matAd[va][vb]=1;
    }
        
    public void nuevoArco(int va, int vb)throws Exception{ // Otra versión del método recibe directamente los números de vértice del arco.
        if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
        matAd[va][vb]=1;
    }
    
    public boolean adyacente(String a, String b)throws Exception{
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
        return matAd[va][vb] == 1;
    }
    
    public boolean adyacente(int va, int vb)throws Exception{
        if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
        return matAd[va][vb]==1;
    } 

    
    
}
