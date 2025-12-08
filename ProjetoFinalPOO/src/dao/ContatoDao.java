
package dao;

import interfaces.InterfaceDao;
import java.sql.SQLException;
import modelo.ContatoModelo;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;



public class ContatoDao implements InterfaceDao{
    
    String sql;
    PreparedStatement stm;
    ResultSet resultado;

    @Override
    public void salvarDao(Object... valor) {
        ContatoModelo tcm = (ContatoModelo) valor[0];
        
        if(tcm.getId() == 0){
            sql = "INSERT INTO tb_pessoa (nomePessoa, sobrenomePessoa, telefone, endEmail) VALUES (?, ?, ?, ?)";
        }
        else{
            sql = "UPDATE tb_pessoa SET nomePessoa =?, sobrenomePessoa =?, telefone =?, endEmail =? WHERE idPessoa =?";
        }
        
        try{
            stm = ConexaoBanco.abreConexao().prepareStatement(sql);
            
            stm.setString(1, tcm.getNomePessoa());
            stm.setString(2, tcm.getSobrenomePessoa());
            stm.setString(3, tcm.getTelefone());
            stm.setString(4, tcm.getEndEmail());
            
            if(tcm.getId()>0) stm.setInt(5, tcm.getId());
            stm.execute();
            
            JOptionPane.showMessageDialog(null, "Operação realizada com sucesso");
        }
        catch (Exception e){
            
        }
        
    }

    public void consultaDao(Object... valor) throws SQLException {
        
        DefaultTableModel tabela = (DefaultTableModel) valor[1];
        
        if ("".equals((String) valor[0])){
            sql = "SELECT * from tb_pessoa";
        }
        else{
            sql = "SELECT * FROM tb_pessoa WHERE nomePessoa LIKE '%"+valor[0]+"%'";
        }
        
        stm = ConexaoBanco.abreConexao().prepareStatement(sql);
        resultado = stm.executeQuery();
        
        while (resultado.next()){
            tabela.addRow(
                    new Object[]{
                        resultado.getString("idPessoa"),
                        resultado.getString("nomePessoa"),
                        resultado.getString("sobrenomePessoa"),
                        resultado.getString("telefone"),
                        resultado.getString("endEmail")
                    }
            
            );
        }
        stm.close();
    }
    @Override
    public void excluirDao(int id) {
        sql = "DELETE FROM tb_pessoa WHERE idPessoa=?";
        
        try{
            stm = ConexaoBanco.abreConexao().prepareStatement(sql);
            stm.setInt(1, id);
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
            
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR O REGISTRO"+e);
        }
    
    }

    @Override
    public void consultarDao(Object... valor) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
}
