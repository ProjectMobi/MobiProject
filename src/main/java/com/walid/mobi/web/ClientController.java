package com.walid.mobi.web;

import com.walid.mobi.entities.Client;
import com.walid.mobi.metier.IClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {

    @Autowired
    private IClient client;

    @RequestMapping("/clients")
    public String index(){

        return "clients";
    }
    @RequestMapping("/consulterClient")
    public String consulter(Model model, Long cin){
        try {
            Client ct = client.consulterClient(cin);
            model.addAttribute("client",ct);
        }catch (Exception e){
            model.addAttribute("exception",e);
        }

        return "clients";
    }
}
