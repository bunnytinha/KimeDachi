import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PaginaAcesso
{
   public static void main (String [] args)
   {
      //definindo dimensões
      int telaH;
      int telaW;
      Toolkit tk = Toolkit.getDefaultToolkit();
      Dimension d = tk.getScreenSize();
      telaW = d.width;
      telaH = d.height;
      int centroW = telaW/2;
      int centroH = telaH/2;
      
      JFrame tela = new JFrame ("Kime Dachi - Login");
      
      //teste
      final JLabel label = new JLabel ();
      label.setBounds(centroW-50,centroH+200, 200,50);
      
      //imagem
      ImageIcon i = new ImageIcon("C:/Docs/Kime Dachi/kimedachi.png");
      JLabel kimedachi = new JLabel(i);
      kimedachi.setBounds(centroW-50,centroH-375,100,100);
      
      //user
      JLabel user = new JLabel ("Username:");
      user.setBounds(centroW-52, centroH-40, 80, 30);
      final JTextField user1 = new JTextField();
      user1.setBounds(centroW+20, centroH-40, 100, 30);
      
      //senha
      JLabel senha = new JLabel ("Senha:");
      senha.setBounds(centroW-30, centroH, 80, 30);
      final JPasswordField senha1 = new JPasswordField();
      senha1.setBounds(centroW+20, centroH, 100, 30);
      
      //botao login
      JButton login = new JButton ("Login");
      login.setBounds(centroW, centroH+100, 80, 30);

      //configuracoes da tela
      tela.add(senha1); tela.add(user); tela.add(label); tela.add(senha); tela.add(login); tela.add(user1);  
      tela.setExtendedState(JFrame.MAXIMIZED_BOTH);    
      tela.setLayout(null);    
      tela.setVisible(true);
      
      login.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            //teste
            String data = "Username: " + user1.getText();
            data += " Senha: " + new String(senha1.getPassword());
            label.setText(data);
         }
      });
   }
}