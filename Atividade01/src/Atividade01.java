import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Atividade01 {
   public JPanel FrmPrincipal;
   public JTextField TxtValor1;
   public JTextField TxtValor2;
   public JRadioButton RdbAdicao;
   public JRadioButton RdbSubtracao;
   public JRadioButton RdbMultiplicacao;
   public JRadioButton RdbDivisao;
   public JButton BtnCalcular;
   Long valor1;
   Long valor2;
   Long resultado;

   public Atividade01() {
      BtnCalcular.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String textoValor1 = TxtValor1.getText();
            String textoValor2 = TxtValor2.getText();

            valor1 = Long.parseLong(textoValor1);
            valor2 = Long.parseLong(textoValor2);

            if(RdbAdicao.isSelected()) resultado = valor1 + valor2;
            if(RdbSubtracao.isSelected()) resultado = valor1 - valor2;
            if(RdbMultiplicacao.isSelected()) resultado = valor1 * valor2;
            if(RdbDivisao.isSelected()) resultado = valor1 / valor2;

            JOptionPane.showMessageDialog(null,"Resultado: " + resultado);
         }
      });
   }
}
