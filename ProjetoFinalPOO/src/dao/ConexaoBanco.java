package dao;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;



public class ConexaoBanco {
    private static final String driverClass = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/contatos";
    private static final String user = "root";
    private static final String senha = "toor";
    

    
    public static Connection abreConexao(){
        
        Connection con = null;
        
        try{
            Class.forName(driverClass);
            con = DriverManager.getConnection(url, user, senha);
        }
        catch (Exception erro){
            JOptionPane.showMessageDialog(null, "Erro de conexão com o banco de dados! Erro: "+ erro);
        }
        return con;
        
        
    }
    
}
