package com.ragulhari.guiaSus.listObjects;

import org.json.JSONException;
import org.json.JSONObject;

public class placeListObjectItem {

    //Dados Gerais do estabelecimento
    public String strCnes;
    public String strNomeFantasia;
    public String strTipoUnidade;
    public String strTelefone;
    private String strEsferaAdministrativa;
    public String strVinculoSus;
    public String strTurnoAtendimento;

    //Serviços Prestados pelo estabelecimento
    public String strAtendimentoUrgencia;
    public String strObstetra;
    public String strNeoNatal;

    //Endereço do estabelecimento
    public String strLogradouro;
    public String strNumero;
    public String strBairro;
    public String strCidade;
    public String strUf;
    private String strCep;

    public String latitude;
    public String longitude;



    public placeListObjectItem(){
        this.strCnes = "";
        this.strNomeFantasia = "";
        this.strTipoUnidade = "";
        this.strTelefone = "";
        this.strEsferaAdministrativa = "";
        this.strVinculoSus = "";
        this.strTurnoAtendimento = "";
        this.strAtendimentoUrgencia = "";
        this.strObstetra = "";
        this.strNeoNatal = "";
        this.strLogradouro = "";
        this.strNumero = "";
        this.strBairro = "";
        this.strCidade = "";
        this.strUf = "";
        this.strCep = "";
        this.latitude = "";
        this.longitude = "";
    }

    public placeListObjectItem(String pCnes, String pNomeFantasia, String pTipoUnidade, String pTelefone,
                               String pEsferaAdministrativa, String pVinculoSus, String pTurnoAtendimento,
                               String pLogradouro, String pNumero, String pBairro, String pCidade, String pUf,
                               String pCep, String pAtendimentoUrgencia, String pObstetra, String pNeoNatal, String pLatitude, String pLongitude) {
        this.strCnes = pCnes;
        this.strNomeFantasia = pNomeFantasia;
        this.strTipoUnidade = pTipoUnidade;
        this.strTelefone = pTelefone;
        this.strEsferaAdministrativa = pEsferaAdministrativa;
        this.strVinculoSus = pVinculoSus;
        this.strTurnoAtendimento = pTurnoAtendimento;
        this.strAtendimentoUrgencia = pAtendimentoUrgencia;
        this.strObstetra = pObstetra;
        this.strNeoNatal = pNeoNatal;
        this.strLogradouro = pLogradouro;
        this.strNumero = pNumero;
        this.strBairro = pBairro;
        this.strCidade = pCidade;
        this.strUf = pUf;
        this.strCep = pCep;
        this.latitude = pLatitude;
        this.longitude = pLongitude;

    }

    public void createObjectFromJSON(JSONObject obj) {
        try {
            this.strCnes = obj.getString("codCnes");
            this.strNomeFantasia = obj.getString("nomeFantasia");
            this.strTipoUnidade =  obj.getString("tipoUnidade");
            this.strTelefone =  obj.getString("telefone");
            this.strEsferaAdministrativa =  obj.getString("esferaAdministrativa");
            this.strVinculoSus =  obj.getString("vinculoSus");
            this.strTurnoAtendimento =  obj.getString("turnoAtendimento");
            this.strAtendimentoUrgencia = obj.getString("temAtendimentoUrgencia");
            this.strObstetra = obj.getString("temObstetra");
            this.strNeoNatal = obj.getString("temNeoNatal");
            this.strLogradouro = obj.getString("logradouro");
            this.strNumero = obj.getString("numero");
            this.strBairro = obj.getString("bairro");
            this.strCidade = obj.getString("cidade");
            this.strUf = obj.getString("uf");
            this.strCep = obj.getString("cep");
            this.latitude = obj.getString("latitude");
            this.longitude = obj.getString("longitude");
        }
        catch (JSONException err) {
            err.printStackTrace();
        }
    }


    public String convertToString()
    {
        return "{" +
                "\"codCnes\":\"" + this.strCnes + "\"," +
                "\"nomeFantasia\":\"" + this.strNomeFantasia + "\"," +
                "\"tipoUnidade\":\"" + this.strTipoUnidade + "\"," +
                "\"telefone\":\"" + this.strTelefone + "\"," +
                "\"esferaAdministrativa\":\"" + this.strEsferaAdministrativa + "\"," +
                "\"vinculoSus\":\"" + this.strVinculoSus + "\"," +
                "\"turnoAtendimento\":\"" + this.strTurnoAtendimento + "\"," +
                "\"temAtendimentoUrgencia\":\"" + this.strAtendimentoUrgencia + "\"," +
                "\"temObstetra\":\"" + this.strObstetra + "\"," +
                "\"temNeoNatal\":\"" + this.strNeoNatal + "\"," +
                "\"logradouro\":\"" + this.strLogradouro + "\"," +
                "\"numero\":\"" + this.strNumero + "\"," +
                "\"bairro\":\"" + this.strBairro + "\"," +
                "\"cidade\":\"" + this.strCidade + "\"," +
                "\"uf\":\"" + this.strUf + "\"," +
                "\"cep\":\"" + this.strCep + "\"," +
                "\"latitude\":\"" + this.latitude + "\"," +
                "\"longitude\":\"" + this.longitude + "\"" +
                "}";
    }

}