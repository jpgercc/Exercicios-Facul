import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Criar a janela (JFrame)
        JFrame frame = new JFrame("Jokenpo com Dom Quixote");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Criar um array com as opções do jogo
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        // Criar componentes da GUI
        JLabel labelMensagem = new JLabel("Escolha sua arma contra Dom Quixote:");
        JComboBox<String> comboBoxOpcoes = new JComboBox<>(opcoes);
        JButton botaoJogar = new JButton("Jogar");
        JTextArea areaResultado = new JTextArea(5, 30);
        areaResultado.setEditable(false);

        // Adicionar componentes ao frame
        frame.add(labelMensagem);
        frame.add(comboBoxOpcoes);
        frame.add(botaoJogar);
        frame.add(new JScrollPane(areaResultado));

        // Adicionar ação ao botão "Jogar"
        botaoJogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                int escolhaJogador = comboBoxOpcoes.getSelectedIndex();
                int escolhaComputador = random.nextInt(3);

                // Mostrar escolhas
                String resultado = "Você escolheu: " + opcoes[escolhaJogador] + "\n";
                resultado += "Dom Quixote escolheu: " + opcoes[escolhaComputador] + "\n";

                // Verificar o resultado
                if (escolhaJogador == escolhaComputador) {
                    resultado += "Resultado: Empate!\n";
                } else if ((escolhaJogador == 0 && escolhaComputador == 2) ||
                        (escolhaJogador == 1 && escolhaComputador == 0) ||
                        (escolhaJogador == 2 && escolhaComputador == 1)) {
                    resultado += "Resultado: Você venceu Dom Quixote de la Mancha!\n";
                } else {
                    resultado += "Resultado: Dom Quixote venceu!\n";
                }

                // Exibir resultado na área de texto
                areaResultado.setText(resultado);
            }
        });

        // Tornar a janela visível
        frame.setVisible(true);
    }
}