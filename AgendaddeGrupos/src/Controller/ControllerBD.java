/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Guild;
import Model.Player;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Wilmar
 */
public class ControllerBD {

    Connection con;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;

    String database = "agendagrupo";
    String url = "jdbc:mysql://127.0.0.1:3306/" + database + "?useTimezone=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
    String user = "root";
    String password = "root";
    boolean sucesso = false;

    public void connectToDB() {
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        }
    }

    public boolean adicionarGuild(Guild guild) {
        connectToDB();
        String sql = "INSERT INTO guild (Nome, Leader, server, grupos) values(?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, guild.getNome());
            pst.setString(2, guild.getLider());
            pst.setString(3, guild.getServidor());
            pst.setInt(4, 0);
            pst.execute();
            sucesso = true;
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }

        return sucesso;
    }

    public Boolean procurarGuild(String nome) {

        connectToDB();
        String sql = "SELECT * FROM guild WHERE  Nome = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            rs = pst.executeQuery();
            rs.next();
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return sucesso;
    }
    public ArrayList<String> listarGrupos(String nome) {
        ArrayList<String> grupo = new ArrayList();
        connectToDB();
        String sql = "select * From guild g join grupos p on g.Nome = p.Guild_Nome where g.Nome = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            rs = pst.executeQuery();
            while (rs.next()) {
                String aux = rs.getString("p.Nome");
                grupo.add(aux);
            }
            return grupo;
        } catch (SQLException e) {
            System.out.println("Erro: " + nome + e.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return grupo;
    }
    public void salvarNomeGuild(String nome) {
        connectToDB();
        String sql = "UPDATE `agendagrupo`.`pesquisa` SET `Nome` = ? WHERE (`idpe` = '1');";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            pst.execute();
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
    }

    public String selecionarGuild() {
        String nome = "";
        connectToDB();
        String sql = "SELECT * FROM pesquisa WHERE  idpe = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, 1);
            rs = pst.executeQuery();
            rs.next();
            String aux = rs.getString("Nome");
            return aux;

        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return nome;
    }
    public void adicionarGrupo(String guild,String nome,String tipo){
        connectToDB();
        String sql = "INSERT INTO grupos (Nome,Guild_Nome, tipo) values(?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,nome);
            pst.setString(2,guild);
            pst.setString(3,tipo);
            pst.execute();
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        
    }
    public void adicionarPlayer(Player player,String grupo,String raca){
        connectToDB();
        
        String sql = "INSERT INTO player values(?,?,?,?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, player.getNick());
            pst.setInt(2, player.getIlvl());
            if(player.getClasses().equals("Guerreiro")){
                pst.setInt(3, player.setAtributo().getForça());
                
            }
            else if(player.getClasses().equals("Caçador") || 
                    player.getClasses().equals("Rogue")||
                    player.getClasses().equals("Druida")){
                pst.setInt(3, player.setAtributo().getGilidade());
            }
            else if(player.getClasses().equals("Mago") || 
                    player.getClasses().equals("Sarcedote")||
                    player.getClasses().equals("Bruxo") ||
                    player.getClasses().equals("Paladino")||
                    player.getClasses().equals("Xamã")){
                pst.setInt(3, player.setAtributo().getIntelecto());                
            }
            pst.setInt(4,player.setAtributo().getAcertoCritico());
            pst.setInt(5,player.setAtributo().getMaestria());
            pst.setInt(6,player.setAtributo().getAceleracao());
            pst.setString(7,player.getFunção());
            pst.setString(8,player.getClasses());
            pst.setString(9,grupo);
            pst.setString(10,raca);
            pst.execute();
        } catch (SQLException exc) {
            System.out.println("Erro:" + exc.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
    }
    public ArrayList<String> listarMembros(String nome){
        ArrayList lista = new ArrayList();
        String aux;
        connectToDB();
        String sql = "select * From grupos g join player p "
                + "on g.Nome = p.grupos_Nome where g.Nome = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            rs = pst.executeQuery();
            while (rs.next()) {
                aux = rs.getString("p.Nick");
                lista.add(aux);
                aux = rs.getString("p.ILVL");
                lista.add(aux);
                aux = rs.getString("p.AtributoPrimario");
                lista.add(aux);
                aux = rs.getString("p.AcertoCritico");
                lista.add(aux);
                aux = rs.getString("p.Maestria");
                lista.add(aux);
                aux = rs.getString("p.Aceleracao");
                lista.add(aux);
                aux = rs.getString("p.Funcao");
                lista.add(aux);
                aux = rs.getString("p.classe");
                lista.add(aux);
                aux = rs.getString("p.raca");
                lista.add(aux);
            }
            return lista;
        } catch (SQLException e) {
            System.out.println("Erro: " + nome + e.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }      
        return lista;
    }
    public void salvarGrupo(String nome) {
        connectToDB();
        String sql = "UPDATE `agendagrupo`.`pesquisa` SET `Nome` = ? WHERE (`idpe` = '2');";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            pst.execute();
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
    }
    public String selecionarGrupo() {
        String nome = "";
        connectToDB();
        String sql = "SELECT * FROM pesquisa WHERE  idpe = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, 2);
            rs = pst.executeQuery();
            rs.next();
            String aux = rs.getString("Nome");
            return aux;

        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return nome;
    }
    public void editarPersonagem(String nome,String ilvl, String funcao){
        connectToDB();
        String sql = "UPDATE `agendagrupo`.`player` SET `ILVL` = ?, `funcao` = "
                + "? WHERE (`Nick` = ?);";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,ilvl);
            pst.setString(2,funcao);
            pst.setString(3,nome);
            pst.execute();
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
    }   
    public void apagarPersonagem(String nome){
        connectToDB();
        String sql = "DELETE FROM `agendagrupo`.`player` WHERE (`Nick` = ?);";        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,nome);
            pst.execute();
            System.out.println(nome+" pagado");
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }    
    }
}