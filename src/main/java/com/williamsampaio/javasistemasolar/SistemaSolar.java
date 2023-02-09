package com.williamsampaio.javasistemasolar;

/*
 SistemaSolar.java
 Projeto Base para Simulação de Sistema Solar
 Autor: Guilherme Bezerra Fernandes
 Data: 11/09/2012
 Link: https://aulasguilherme.wordpress.com/2014/10/07/projeto-09-base-simulacao-do-sistema-solar-em-java/

Principal_Solar.java
Projeto Base para Simulação de Sistema Solar V2
Autor:  William Sampaio (D7534B-7)/ Lisvanete Garcia / Levy Lira
        Universudade Paulista - UNIP (Campus Manaus)
        Tecnologia em Análise e Desenvolvimento de Sistemas
        Coordenador: Prof. Cristiano Nascimento
        Turma: DS4A34
Data: 25/09/2019
 */
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

public class SistemaSolar extends JPanel {

    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension tela = tk.getScreenSize();

    private final int largura = tela.width;   //largura da janela
    private final int altura = tela.height;     //altura da janela

    private final Image fundo;    //estrelas
    private final Image sol;      //sol
    private final Image mercurio; //mercúrio
    private final Image venus;    //venus
    private final Image terra;    //terra
    private final Image lua;      //lua
    private final Image marte;    //marte
    private final Image jupiter;  //jupiter
    private final Image l1;       //lua de jupiter lo
    private final Image l2;       //lua de jupiter europa
    private final Image l3;       //lua de jupiter gánimedes
    private final Image l4;       //lua de jupiter calisto
    private final Image saturno;  //saturno
    private final Image urano;    //urano
    private final Image netuno;   //netuno

    //variáveis do sol
    int xtam_sol, ytam_sol;

    //variáveis de mercúrio
    int x_merc, y_merc, dx_merc, dy_merc;
    int r_merc; //tamanho da trajetória de mercúrio
    int i_merc = 0;
    int xtam_merc;
    int ytam_merc;

    //variáveis de venus
    int x_venus, y_venus, dx_venus, dy_venus;
    int r_venus; //tamanho da trajetória de venus
    int i_venus = 0;
    int xtam_venus;
    int ytam_venus;

    //variáveis de terra
    int x_terra, y_terra, dx_terra, dy_terra;
    int r_terra; //tamanho da trajetória de terra
    int i_terra = 0;
    int xtam_terra;
    int ytam_terra;

    //variáveis de lua
    int x_lua, y_lua, dx_lua, dy_lua;
    int r_lua; //tamanho da trajetória de lua
    int i_lua = 0;
    int xtam_lua;
    int ytam_lua;

    //variáveis de marte
    int x_marte, y_marte, dx_marte, dy_marte;
    int r_marte; //tamanho da trajetória de marte
    int i_marte = 0;
    int xtam_marte;
    int ytam_marte;

    //variáveis de jupiter
    int x_jupiter, y_jupiter, dx_jupiter, dy_jupiter;
    int r_jupiter; //tamanho da trajetória de jupiter
    int i_jupiter = 0;
    int xtam_jupiter;
    int ytam_jupiter;

    //variáveis de lua de jupiter lo
    int x_l1, y_l1, dx_l1, dy_l1;
    int r_l1; //tamanho da trajetória de lua
    int i_l1 = 0;
    int xtam_l1;
    int ytam_l1;

    //variáveis de lua de jupiter europa
    int x_l2, y_l2, dx_l2, dy_l2;
    int r_l2; //tamanho da trajetória de lua
    int i_l2 = 0;
    int xtam_l2;
    int ytam_l2;

    //variáveis de lua de jupiter ganimedes
    int x_l3, y_l3, dx_l3, dy_l3;
    int r_l3; //tamanho da trajetória de lua
    int i_l3 = 0;
    int xtam_l3;
    int ytam_l3;

    //variáveis de lua de jupiter calisto
    int x_l4, y_l4, dx_l4, dy_l4;
    int r_l4; //tamanho da trajetória de lua
    int i_l4 = 0;
    int xtam_l4;
    int ytam_l4;

    //variáveis de saturno
    int x_saturno, y_saturno, dx_saturno, dy_saturno;
    int r_saturno; //tamanho da trajetória de saturno
    int i_saturno = 0;
    int xtam_saturno;
    int ytam_saturno;

    //variáveis de urano
    int x_urano, y_urano, dx_urano, dy_urano;
    int r_urano; //tamanho da trajetória de urano
    int i_urano = 0;
    int xtam_urano;
    int ytam_urano;

    //variáveis de netuno
    int x_netuno, y_netuno, dx_netuno, dy_netuno;
    int r_netuno; //tamanho da trajetória de netuno
    int i_netuno = 0;
    int xtam_netuno;
    int ytam_netuno;

    Timer tempo = new Timer();

    public SistemaSolar() {

        xtam_sol = 160;
        ytam_sol = 160;

        xtam_merc = 10;
        ytam_merc = 10;
        r_merc = 40; //tamanho do raio da trajetória de mercúrio
        dx_merc = (largura / 2) - (xtam_merc / 2); //posição x inicial do circulo de mercurio
        dy_merc = (altura / 2) - (ytam_merc / 2); //posição y inicial do circulo de mercurio
        x_merc = 0;
        y_merc = 0;

        xtam_venus = 12;
        ytam_venus = 12;
        r_venus = 55; //tamanho do raio da trajetória de venus
        dx_venus = (largura / 2) - (xtam_venus / 2); //posição x inicial do circulo de venus
        dy_venus = (altura / 2) - (ytam_venus / 2); //posição y inicial do circulo de venus
        x_venus = 0;
        y_venus = 0;

        xtam_terra = 16;
        ytam_terra = 16;
        r_terra = 70; //tamanho do raio da trajetória de terra
        dx_terra = (largura / 2) - (xtam_terra / 2); //posição x inicial do circulo de terra
        dy_terra = (altura / 2) - (ytam_terra / 2); //posição y inicial do circulo de terra
        x_terra = 0;
        y_terra = 0;

        xtam_lua = 10;
        ytam_lua = 10;
        r_lua = 10; //tamanho do raio da trajetória de lua
        dx_lua = (largura / 2) - (xtam_lua / 2); //posição x inicial do circulo de lua
        dy_lua = (altura / 2) - (ytam_lua / 2); //posição y inicial do circulo de lua
        x_lua = 0;
        y_lua = 0;

        xtam_marte = 14;
        ytam_marte = 14;
        r_marte = 90; //tamanho do raio da trajetória de marte
        dx_marte = (largura / 2) - (xtam_marte / 2); //posição x inicial do circulo de marte
        dy_marte = (altura / 2) - (ytam_marte / 2); //posição y inicial do circulo de marte
        x_marte = 0;
        y_marte = 0;

        xtam_jupiter = 24;
        ytam_jupiter = 24;
        r_jupiter = 120; //tamanho do raio da trajetória de jupiter
        dx_jupiter = (largura / 2) - (xtam_jupiter / 2); //posição x inicial do circulo de jupiter
        dy_jupiter = (altura / 2) - (ytam_jupiter / 2); //posição y inicial do circulo de jupiter
        x_jupiter = 0;
        y_jupiter = 0;

        xtam_l1 = 8;
        ytam_l1 = 8;
        r_l1 = 8; //tamanho do raio da trajetória de lua
        dx_l1 = (largura / 2) - (xtam_l1 / 2); //posição x inicial do circulo de lua
        dy_l1 = (altura / 2) - (ytam_l1 / 2); //posição y inicial do circulo de lua
        x_l1 = 0;
        y_l1 = 0;

        xtam_l2 = 8;
        ytam_l2 = 8;
        r_l2 = 10; //tamanho do raio da trajetória de lua
        dx_l2 = (largura / 2) - (xtam_l2 / 2); //posição x inicial do circulo de lua
        dy_l2 = (altura / 2) - (ytam_l2 / 2); //posição y inicial do circulo de lua
        x_l2 = 0;
        y_l2 = 0;

        xtam_l3 = 8;
        ytam_l3 = 8;
        r_l3 = 12; //tamanho do raio da trajetória de lua
        dx_l3 = (largura / 2) - (xtam_l3 / 2); //posição x inicial do circulo de lua
        dy_l3 = (altura / 2) - (ytam_l3 / 2); //posição y inicial do circulo de lua
        x_l3 = 0;
        y_l3 = 0;

        xtam_l4 = 8;
        ytam_l4 = 8;
        r_l4 = 14; //tamanho do raio da trajetória de lua
        dx_l4 = (largura / 2) - (xtam_l4 / 2); //posição x inicial do circulo de lua
        dy_l4 = (altura / 2) - (ytam_l4 / 2); //posição y inicial do circulo de lua
        x_l4 = 0;
        y_l4 = 0;

        xtam_saturno = 52;
        ytam_saturno = 22;
        r_saturno = 150; //tamanho do raio da trajetória de saturno
        dx_saturno = (largura / 2) - (xtam_saturno / 2); //posição x inicial do circulo de saturno
        dy_saturno = (altura / 2) - (ytam_saturno / 2); //posição y inicial do circulo de saturno
        x_saturno = 0;
        y_saturno = 0;

        xtam_urano = 20;
        ytam_urano = 20;
        r_urano = 180; //tamanho do raio da trajetória de urano
        dx_urano = (largura / 2) - (xtam_urano / 2); //posição x inicial do circulo de urano
        dy_urano = (altura / 2) - (ytam_urano / 2); //posição y inicial do circulo de urano
        x_urano = 0;
        y_urano = 0;

        xtam_netuno = 18;
        ytam_netuno = 18;
        r_netuno = 210; //tamanho do raio da trajetória de netuno
        dx_netuno = (largura / 2) - (xtam_netuno / 2); //posição x inicial do circulo de netuno
        dy_netuno = (altura / 2) - (ytam_netuno / 2); //posição y inicial do circulo de netuno
        x_netuno = 0;
        y_netuno = 0;

        sol = Toolkit.getDefaultToolkit().getImage("assets/sol.png");
        fundo = Toolkit.getDefaultToolkit().getImage("assets/estrelas.jpg");
        mercurio = Toolkit.getDefaultToolkit().getImage("assets/mercurio.png");
        venus = Toolkit.getDefaultToolkit().getImage("assets/venus.png");
        terra = Toolkit.getDefaultToolkit().getImage("assets/terra.png");
        lua = Toolkit.getDefaultToolkit().getImage("assets/lua.png");
        marte = Toolkit.getDefaultToolkit().getImage("assets/marte.png");
        jupiter = Toolkit.getDefaultToolkit().getImage("assets/jupiter.png");
        l1 = Toolkit.getDefaultToolkit().getImage("assets/Jluas.png");
        l2 = Toolkit.getDefaultToolkit().getImage("assets/Jluas.png");
        l3 = Toolkit.getDefaultToolkit().getImage("assets/Jluas.png");
        l4 = Toolkit.getDefaultToolkit().getImage("assets/Jluas.png");
        saturno = Toolkit.getDefaultToolkit().getImage("assets/saturno.png");
        urano = Toolkit.getDefaultToolkit().getImage("assets/urano.png");
        netuno = Toolkit.getDefaultToolkit().getImage("assets/netuno.png");

        //ajusta a velocidade do movimento
        tempo.schedule(new temp_mercurio(), 0, 4);
        tempo.schedule(new temp_venus(), 0, 8);
        tempo.schedule(new temp_terra(), 0, 12);
        tempo.schedule(new temp_lua(), 0, 4);
        tempo.schedule(new temp_marte(), 0, 25);
        tempo.schedule(new temp_jupiter(), 0, 50);
        tempo.schedule(new temp_l1(), 0, 2);
        tempo.schedule(new temp_l2(), 0, 4);
        tempo.schedule(new temp_l3(), 0, 6);
        tempo.schedule(new temp_l4(), 0, 8);
        tempo.schedule(new temp_saturno(), 0, 100);
        tempo.schedule(new temp_urano(), 0, 200);
        tempo.schedule(new temp_netuno(), 0, 400);

    }

    @Override
    public void paintComponent(Graphics g) {

        //Desenha o Fundo com estrelas
        g.drawImage(fundo, 0, 0, largura, altura, this);//Carrega a imagem das estrelas 800x600

        //Desenha o Sol
        g.drawImage(sol, ((largura / 2) - (xtam_sol / 2)), ((altura / 2) - (ytam_sol / 2)), xtam_sol, ytam_sol, this);//Carrega a imagem do sol130x130

        //Planeta Mercúrio...
        //Cor do nome do planeta vermelha
        g.setColor(Color.yellow);

        //Imagem do planeta mercurio
        g.drawOval((largura / 2) - ((r_merc * 6) / 2), (altura / 2) - ((r_merc * 2) / 2), r_merc * 6, r_merc * 2); //desenha tragetoria
        g.drawImage(mercurio, x_merc + dx_merc, y_merc + dy_merc, xtam_merc, ytam_merc, this);

        //Imagem do planeta venus
        g.drawOval((largura / 2) - ((r_venus * 6) / 2), (altura / 2) - ((r_venus * 2) / 2), r_venus * 6, r_venus * 2); //desenha tragetoria
        g.drawImage(venus, x_venus + dx_venus, y_venus + dy_venus, xtam_venus, ytam_venus, this);

        //Imagem do planeta terra
        g.drawOval((largura / 2) - ((r_terra * 6) / 2), (altura / 2) - ((r_terra * 2) / 2), r_terra * 6, r_terra * 2); //desenha tragetoria
        g.drawImage(terra, x_terra + dx_terra, y_terra + dy_terra, xtam_terra, ytam_terra, this);

        //Imagem do planeta lua
        g.drawOval((largura / 2) - ((r_lua * 6) / 2) + x_terra, (altura / 2) - r_lua + y_terra, r_lua * 6, r_lua * 2); //desenha tragetoria
        g.drawImage(lua, x_lua + dx_lua, y_lua + dy_lua, 6, 6, this);

        //Imagem do planeta marte
        g.drawOval((largura / 2) - ((r_marte * 6) / 2), (altura / 2) - ((r_marte * 2) / 2), r_marte * 6, r_marte * 2); //desenha tragetoria
        g.drawImage(marte, x_marte + dx_marte, y_marte + dy_marte, xtam_marte, ytam_marte, this);

        //Imagem do planeta r_jupiter
        g.drawOval((largura / 2) - ((r_jupiter * 6) / 2), (altura / 2) - ((r_jupiter * 2) / 2), r_jupiter * 6, r_jupiter * 2); //desenha tragetoria
        g.drawImage(jupiter, x_jupiter + dx_jupiter, y_jupiter + dy_jupiter, xtam_jupiter, ytam_jupiter, this);

        //Imagem do planeta lua de jupiter lo
        //g.drawOval((largura / 2) - ((r_l1 * 6) / 2) + x_jupiter, (altura / 2) - r_l1 + y_jupiter, r_l1 * 6, r_l1 * 2); //desenha tragetoria
        g.drawImage(l1, x_l1 + dx_l1, y_l1 + dy_l1, 6, 6, this);

        //Imagem do planeta lua de jupiter europa
        //g.drawOval((largura / 2) - ((r_l2 * 6) / 2) + x_jupiter, (altura / 2) - r_l2 + y_jupiter, r_l2 * 6, r_l2 * 2); //desenha tragetoria
        g.drawImage(l2, x_l2 + dx_l2, y_l2 + dy_l2, 6, 6, this);

        //Imagem do planeta lua de jupiter gánimedes
        //g.drawOval((largura / 2) - ((r_l3 * 6) / 2) + x_jupiter, (altura / 2) - r_l3 + y_jupiter, r_l3 * 6, r_l3 * 2); //desenha tragetoria
        g.drawImage(l3, x_l3 + dx_l3, y_l3 + dy_l3, 6, 6, this);

        //Imagem do planeta lua de jupiter calisto
        //g.drawOval((largura / 2) - ((r_l4 * 6) / 2) + x_jupiter, (altura / 2) - r_l4 + y_jupiter, r_l4 * 6, r_l4 * 2); //desenha tragetoria
        g.drawImage(l4, x_l4 + dx_l4, y_l4 + dy_l4, 6, 6, this);

        //Imagem do planeta saturno
        g.drawOval((largura / 2) - ((r_saturno * 6) / 2), (altura / 2) - ((r_saturno * 2) / 2), r_saturno * 6, r_saturno * 2); //desenha tragetoria
        g.drawImage(saturno, x_saturno + dx_saturno, y_saturno + dy_saturno, xtam_saturno, ytam_saturno, this);

        //Imagem do planeta r_urano
        g.drawOval((largura / 2) - ((r_urano * 6) / 2), (altura / 2) - ((r_urano * 2) / 2), r_urano * 6, r_urano * 2); //desenha tragetoria
        g.drawImage(urano, x_urano + dx_urano, y_urano + dy_urano, xtam_urano, ytam_urano, this);

        //Imagem do planeta terra
        g.drawOval((largura / 2) - ((r_netuno * 6) / 2), (altura / 2) - ((r_netuno * 2) / 2), r_netuno * 6, r_netuno * 2); //desenha tragetoria
        g.drawImage(netuno, x_netuno + dx_netuno, y_netuno + dy_netuno, xtam_netuno, ytam_netuno, this);

        //Texto com o nome do planeta
        g.drawString("Mercúrio", x_merc + dx_merc, y_merc + dy_merc);

        //Texto com o nome do planeta
        g.drawString("Venus", x_venus + dx_venus, y_venus + dy_venus);

        //Texto com o nome do planeta
        g.drawString("Terra", x_terra + dx_terra, y_terra + dy_terra);

        //Texto com o nome do planeta
        g.drawString("Lua", x_lua + dx_lua, y_lua + dy_lua);

        //Texto com o nome do planeta
        g.drawString("Marte", x_marte + dx_marte, y_marte + dy_marte);

        //Texto com o nome do planeta
        g.drawString("Júpiter", x_jupiter + dx_jupiter, y_jupiter + dy_jupiter);

        //Texto com o nome do planeta
        g.drawString("L1", x_l1 + dx_l1, y_l1 + dy_l1);
        g.drawString("L2", x_l2 + dx_l2, y_l2 + dy_l2);
        g.drawString("L3", x_l3 + dx_l3, y_l3 + dy_l3);
        g.drawString("L4", x_l4 + dx_l4, y_l4 + dy_l4);
        g.drawString("LUAS DE JÚPITER:", 50, 100);
        g.drawString("L1: Lo", 50, 115);
        g.drawString("L2: Europa", 50, 130);
        g.drawString("L3: Ganímedes", 50, 145);
        g.drawString("L4: Calisto", 50, 160);

        //Texto com o nome do planeta
        g.drawString("Saturno", x_saturno + dx_saturno, y_saturno + dy_saturno);

        //Texto com o nome do planeta
        g.drawString("Urano", x_urano + dx_urano, y_urano + dy_urano);

        //Texto com o nome do planeta
        g.drawString("Netuno", x_netuno + dx_netuno, y_netuno + dy_netuno);
        //        -------
    }

    private class temp_mercurio extends TimerTask {

        @Override
        public void run() {

            y_merc = (int) (Math.sin((3.14 * (i_merc + 10)) / 180) * r_merc);
            x_merc = (int) (Math.cos((3.14 * (i_merc + 10)) / 180) * r_merc * 3);
            i_merc++;
            repaint();
        }
    }

    private class temp_venus extends TimerTask {

        @Override
        public void run() {

            y_venus = (int) (Math.sin((3.14 * (i_venus + 10)) / 180) * r_venus);
            x_venus = (int) (Math.cos((3.14 * (i_venus + 10)) / 180) * r_venus * 3);
            i_venus++;
            repaint();
        }
    }

    private class temp_terra extends TimerTask {

        @Override
        public void run() {

            y_terra = (int) (Math.sin((3.14 * (i_terra + 10)) / 180) * r_terra);
            x_terra = (int) (Math.cos((3.14 * (i_terra + 10)) / 180) * r_terra * 3);
            i_terra++;
            repaint();
        }
    }

    private class temp_lua extends TimerTask {

        @Override
        public void run() {

            y_lua = y_terra + (int) (Math.sin((3.14 * (i_lua + 10)) / 180) * r_lua);
            x_lua = x_terra + (int) (Math.cos((3.14 * (i_lua + 10)) / 180) * r_lua * 3);
            i_lua++;
            repaint();
        }
    }

    private class temp_marte extends TimerTask {

        @Override
        public void run() {

            y_marte = (int) (Math.sin((3.14 * (i_marte + 10)) / 180) * r_marte);
            x_marte = (int) (Math.cos((3.14 * (i_marte + 10)) / 180) * r_marte * 3);
            i_marte++;
            repaint();
        }
    }

    private class temp_jupiter extends TimerTask {

        @Override
        public void run() {

            y_jupiter = (int) (Math.sin((3.14 * (i_jupiter + 10)) / 180) * r_jupiter);
            x_jupiter = (int) (Math.cos((3.14 * (i_jupiter + 10)) / 180) * r_jupiter * 3);
            i_jupiter++;
            repaint();
        }
    }

    private class temp_l1 extends TimerTask {

        @Override
        public void run() {

            y_l1 = y_jupiter + (int) (Math.sin((3.14 * (i_l1 + 10)) / 180) * r_l1);
            x_l1 = x_jupiter + (int) (Math.cos((3.14 * (i_l1 + 10)) / 180) * r_l1 * 3);
            i_l1++;
            repaint();
        }
    }

    private class temp_l2 extends TimerTask {

        @Override
        public void run() {

            y_l2 = y_jupiter + (int) (Math.sin((3.14 * (i_l2 + 10)) / 180) * r_l2);
            x_l2 = x_jupiter + (int) (Math.cos((3.14 * (i_l2 + 10)) / 180) * r_l2 * 3);
            i_l2++;
            repaint();
        }
    }

    private class temp_l3 extends TimerTask {

        @Override
        public void run() {

            y_l3 = y_jupiter + (int) (Math.sin((3.14 * (i_l3 + 10)) / 180) * r_l3);
            x_l3 = x_jupiter + (int) (Math.cos((3.14 * (i_l3 + 10)) / 180) * r_l3 * 3);
            i_l3++;
            repaint();
        }
    }

    private class temp_l4 extends TimerTask {

        @Override
        public void run() {

            y_l4 = y_jupiter + (int) (Math.sin((3.14 * (i_l4 + 10)) / 180) * r_l4);
            x_l4 = x_jupiter + (int) (Math.cos((3.14 * (i_l4 + 10)) / 180) * r_l4 * 3);
            i_l4++;
            repaint();
        }
    }

    private class temp_saturno extends TimerTask {

        @Override
        public void run() {

            y_saturno = (int) (Math.sin((3.14 * (i_saturno + 10)) / 180) * r_saturno);
            x_saturno = (int) (Math.cos((3.14 * (i_saturno + 10)) / 180) * r_saturno * 3);
            i_saturno++;
            repaint();
        }
    }

    private class temp_urano extends TimerTask {

        @Override
        public void run() {

            y_urano = (int) (Math.sin((3.14 * (i_urano + 10)) / 180) * r_urano);
            x_urano = (int) (Math.cos((3.14 * (i_urano + 10)) / 180) * r_urano * 3);
            i_urano++;
            repaint();
        }
    }

    private class temp_netuno extends TimerTask {

        @Override
        public void run() {

            y_netuno = (int) (Math.sin((3.14 * (i_netuno + 10)) / 180) * r_netuno);
            x_netuno = (int) (Math.cos((3.14 * (i_netuno + 10)) / 180) * r_netuno * 3);
            i_netuno++;
            repaint();
        }
    }
}
