package com.walid.mobi.metier;

import com.walid.mobi.entities.Client;

import java.util.List;

public interface IClient {
    public List<Client> findAll();
    public Client findById(Long cin);
    public Client create(Client client);
    public Client update(Client client);
    public Client delete(Long cin);
    public Client consulterClient(Long cin);

}
