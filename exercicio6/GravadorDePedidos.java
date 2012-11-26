
package br.ufpb.sistemapedidos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;


public class GravadorDePedidos {



    public List<Pedido> lePedidos() throws IOException{

        ObjectInputStream entrada = null;

        try{
            new ObjectInputStream(new FileInputStream("pedidos.txt"));
            
            return (List<Pedido>) entrada.readObject();

        } catch(FileNotFoundException e){
        	
            throw new IOException("Arquivo nao encontrado",e);
            
        }catch(IOException e){
           
        	throw e;
        	
        }catch(ClassNotFoundException e){
        	
            throw new IOException("Classe nao existe",e);
            
        }finally{
        	
            if(entrada != null){
            	
                entrada.close();
            }
        }
    }

    public  void gravaPedidos(List<Pedido> pedidos) throws IOException{

        ObjectOutputStream saida = null;

        try{
            saida = new ObjectOutputStream(new FileOutputStream("pedidos.txt"));
            
            saida.writeObject(pedidos);

        }catch(FileNotFoundException e){
        	
            throw new IOException("Arquivo nao encontrado",e);

        }catch(IOException e){
        	
            throw e;
            
        }finally{
            if(saida != null){
                saida.close();
            }
        }
    }
}