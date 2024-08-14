package br.com.rodolfopessina.Screenmatch.service;

public interface IConvertDados {
    <T> T obterDados(String json, Class<T> classe);
}
