package com.example.nicolasstegmann.projeto3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Translator {
    // ESTA CLASSE NÃO PODE SER MODIFICADA!
    private class Node {
        private char value;
        private Node parent;
        private Node leftChild;
        private Node rightChild;

        public Node() {
            this.value = ' ';
            this.parent = null;
            this.leftChild = null;
            this.rightChild = null;
        }

        public Node(char value) {
            this.value = value;
            this.parent = null;
            this.leftChild = null;
            this.rightChild = null;
        }

        public char getValue() {
            return value;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }
    }


    // ESTE CONJUNTO DE ATRIBUTOS NÃO PODE SER MODIFICADO, OU
    // SEJA, NÃO É PERMITIDO ADICIONAR NEM REMOVER ATRIBUTOS!
    private Node root;
    private HashMap<Character, Node> map;


    // ESTE CONSTRUTOR DEVE SER PREENCHIDO DE ACORDO COM O ENUNCIADO!
    public Translator() {

        root = new Node();
        map = new HashMap<Character, Node>();

        Node n2;
        char e = 'e';
        n2 = new Node('e');
        map.put('e', n2);
        Node n3 = new Node('t');
        map.put('t', n3);
        root.setLeftChild(n2);
        root.setRightChild(n3);

        Node n4 = new Node('i');
        map.put('i', n4);
        Node n5 = new Node('a');
        map.put('a', n5);
        n2.setLeftChild(n4);
        n2.setRightChild(n5);

        Node n6 = new Node('n');
        map.put('n', n6);
        Node n7 = new Node('m');
        map.put('m', n7);
        n3.setLeftChild(n6);
        n3.setRightChild(n7);

        Node n8 = new Node('s');
        map.put('s', n8);
        Node n9 = new Node('u');
        map.put('u', n9);
        n4.setLeftChild(n8);
        n4.setRightChild(n9);

        Node n10 = new Node('r');
        map.put('r', n10);
        Node n11 = new Node('w');
        map.put('w', n11);
        n5.setLeftChild(n10);
        n5.setRightChild(n11);

        Node n12 = new Node('d');
        map.put('d', n12);
        Node n13 = new Node('k');
        map.put('k', n13);
        n6.setLeftChild(n12);
        n6.setRightChild(n13);

        Node n14 = new Node('g');
        map.put('g', n14);
        Node n15 = new Node('o');
        map.put('o', n15);
        n7.setLeftChild(n14);
        n7.setRightChild(n15);

        Node n16 = new Node('h');
        map.put('h', n16);
        Node n17 = new Node('v');
        map.put('v', n17);
        n8.setLeftChild(n16);
        n8.setRightChild(n17);

        Node n18 = new Node('f');
        map.put('f', n18);
        Node n19 = new Node();
        n9.setLeftChild(n18);
        n9.setRightChild(n19);

        Node n20 = new Node('l');
        map.put('l', n20);
        Node n21 = new Node();
        n10.setLeftChild(n20);
        n10.setRightChild(n21);

        Node n22 = new Node('p');
        map.put('p', n22);
        Node n23 = new Node('j');
        map.put('j', n23);
        n11.setLeftChild(n22);
        n11.setRightChild(n23);

        Node n24 = new Node('b');
        map.put('b', n24);
        Node n25 = new Node('x');
        map.put('x', n25);
        n12.setLeftChild(n24);
        n12.setRightChild(n25);

        Node n26 = new Node('c');
        map.put('c', n26);
        Node n27 = new Node('y');
        map.put('y', n27);
        n13.setLeftChild(n26);
        n13.setRightChild(n27);

        Node n28 = new Node('z');
        map.put('z', n28);
        Node n29 = new Node('q');
        map.put('q', n29);
        n14.setLeftChild(n28);
        n14.setRightChild(n29);

        Node n30 = new Node();

        Node n31 = new Node();
        n15.setLeftChild(n30);
        n15.setRightChild(n31);

        Node n32 = new Node('5');
        map.put('5', n32);
        Node n33 = new Node('4');
        map.put('4', n33);
        n16.setLeftChild(n32);
        n16.setRightChild(n33);

        Node n34 = new Node();
        Node n35 = new Node('3');
        map.put('3', n35);
        n17.setLeftChild(n34);
        n17.setRightChild(n35);

        Node n36 = new Node();
        Node n37 = new Node();
        n18.setLeftChild(n36);
        n18.setRightChild(n37);

        Node n38 = new Node();
        Node n39 = new Node('2');
        map.put('2', n39);
        n19.setLeftChild(n38);
        n19.setRightChild(n39);

        Node n40 = new Node();
        Node n41 = new Node();
        n20.setLeftChild(n40);
        n20.setRightChild(n41);

        Node n42 = new Node();

        Node n43 = new Node();
        n21.setLeftChild(n42);
        n21.setRightChild(n43);

        Node n44 = new Node();
        Node n45 = new Node('1');
        map.put('1', n45);
        n23.setLeftChild(n44);
        n23.setRightChild(n45);

        Node n46 = new Node('6');
        map.put('6', n46);
        Node n47 = new Node();

        n24.setLeftChild(n46);
        n24.setRightChild(n47);

        Node n48 = new Node();

        Node n49 = new Node();
        n25.setLeftChild(n48);
        n25.setRightChild(n49);

        Node n50 = new Node('7');
        map.put('7', n50);
        Node n51 = new Node();
        n28.setLeftChild(n50);
        n28.setRightChild(n51);

        Node n52 = new Node('8');
        map.put('8', n52);
        Node n53 = new Node();
        n30.setLeftChild(n52);
        n30.setRightChild(n53);

        Node n54 = new Node('9');
        map.put('9', n54);
        Node n55 = new Node('0');
        map.put('0', n55);
        n31.setLeftChild(n54);
        n31.setRightChild(n55);

        n2.setParent(root);
        n3.setParent(root);
        n4.setParent(n2);
        n5.setParent(n2);
        n6.setParent(n3);
        n7.setParent(n3);
        n8.setParent(n4);
        n9.setParent(n4);
        n10.setParent(n5);
        n11.setParent(n5);
        n12.setParent(n6);
        n13.setParent(n6);
        n14.setParent(n7);
        n15.setParent(n7);
        n16.setParent(n8);
        n17.setParent(n8);
        n18.setParent(n9);
        n19.setParent(n9);
        n20.setParent(n10);
        n21.setParent(n10);
        n22.setParent(n11);
        n23.setParent(n11);
        n24.setParent(n12);
        n25.setParent(n12);
        n26.setParent(n13);
        n27.setParent(n13);
        n28.setParent(n14);
        n29.setParent(n14);
        n30.setParent(n15);
        n31.setParent(n15);
        n32.setParent(n16);
        n33.setParent(n16);
        n34.setParent(n17);
        n35.setParent(n17);
        n36.setParent(n18);
        n37.setParent(n18);
        n38.setParent(n19);
        n39.setParent(n19);
        n40.setParent(n20);
        n41.setParent(n20);
        n42.setParent(n21);
        n43.setParent(n21);
        n44.setParent(n23);
        n45.setParent(n23);
        n46.setParent(n24);
        n47.setParent(n24);
        n48.setParent(n25);
        n49.setParent(n25);
        n50.setParent(n28);
        n51.setParent(n28);
        n52.setParent(n30);
        n53.setParent(n30);
        n54.setParent(n31);
        n55.setParent(n31);

    }


    // ESTE MÉTODO DEVE SER PREENCHIDO DE ACORDO COM O ENUNCIADO!
    public char morseToChar(String code) {

        Node n = root;

        //char arr[] = code.toCharArray();
        //for(char s: arr){
        for (int i = 0; i < code.length(); i++) {
            char sinal = code.charAt(i);
            if (sinal == '.') {
                if (n.getLeftChild() != null) {
                    n = n.getLeftChild();
                }

            } else {
                if (n.getRightChild() != null) {
                    n = n.getRightChild();
                }
            }

        }

        //LinkedList<Character> list = new LinkedList<>();
        //list.add(v);
        return n.getValue();
    }


    // ESTE MÉTODO DEVE SER PREENCHIDO DE ACORDO COM O ENUNCIADO!
    public String charToMorse(char c) {
        String morseWord = "";
        if (map.containsKey(c)) {
            Node foundNode = map.get(c);

            while (foundNode != root) {
                if (foundNode.getParent().getLeftChild() == foundNode) {
                    String morseSymbol = ".";
                    morseWord = morseSymbol.concat(morseWord);
                    foundNode = foundNode.getParent();
                } else if (foundNode.getParent().getRightChild() == foundNode) {
                    String morseSymbol = "-";
                    morseWord = morseSymbol.concat(morseWord);
                    foundNode = foundNode.getParent();
                }
            }
        }
        return morseWord;
    }


    // ESTE MÉTODO DEVE SER PREENCHIDO DE ACORDO COM O ENUNCIADO!
    public LinkedList<String> getCodes() {
        Queue<Node> queue = new LinkedList<>();
        LinkedList<String> codes = new LinkedList<>();
        queue.add(root);
        char nodeValue;
        String morse;

        while (!queue.isEmpty()) {

            if (queue.peek().getLeftChild() != null) {
                queue.add(queue.peek().getLeftChild());
                nodeValue = queue.peek().getLeftChild().getValue();


                if (nodeValue != ' ') {
                    morse = charToMorse(nodeValue);
                    codes.add(morse);
                }
            }
            if (queue.peek().getRightChild() != null) {
                queue.add(queue.peek().getRightChild());
                nodeValue = queue.peek().getRightChild().getValue();
                if (nodeValue != ' ') {
                    morse = charToMorse(nodeValue);
                    codes.add(morse);
                }
            }
            System.out.println(queue.peek().getValue());
            System.out.println(codes);


            queue.remove();
        }
        return codes;
    }
}

