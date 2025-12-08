
package controle;

import dao.ContatoDao;
import interfaces.InterfaceControle;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import modelo.ContatoModelo;


public class ContatoControle implements InterfaceControle{
    
    ContatoModelo tcm = new ContatoModelo();
    ContatoDao cd = new ContatoDao();
   
            
    @Override
    public void salvarControle(Object... valor){
        
       if ("".equals(valor[0])){
           tcm.setId(0);
       }
       else{
           tcm.setId((Integer.parseInt(valor[0].toString())));
       }
       
       tcm.setNomePessoa((String) valor[1]);
       tcm.setSobrenomePessoa((String) valor[2]);
       tcm.setTelefone((String) valor[3]);
       tcm.setEndEmail((String) valor[4]);
       
       try{
           cd.salvarDao(tcm); 
       }
       catch (ClassCastException e){
           tcm.setId(0);
           
           
       }
       
       
    }
    @Override
    public void excluirControle(int id){
        cd.excluirDao(id);
    }


    @Override
    public void consultaControle(Object... valor) {
        try {
            cd.consultaDao(valor);
        } catch (SQLException ex) {
            System.getLogger(ContatoControle.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
    
}
