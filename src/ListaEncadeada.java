/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aléxia Gomes
 */
public class ListaEncadeada<T> implements Iterable<T> {

    private No head;
    private No tail;

    public No getHead() {
        return head;
    }

    public No getTail() {
        return tail;
    }

    public Iterador<T> iterator() {
        return null;
    }

    protected class No {

        private T data;
        private No anterior;
        private No proximo;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public No getAnterior() {
            return anterior;
        }

        public void setAnterior(No anterior) {
            this.anterior = anterior;
        }

        public No getProximo() {
            return proximo;
        }

        public void setProximo(No proximo) {
            this.proximo = proximo;
        }

        public No(T data, No anterior, No proximo) {
            this.data = data;
            this.anterior = anterior;
            this.proximo = proximo;
        }

    }

}//fecha classe principal
