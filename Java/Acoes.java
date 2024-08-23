
package entities;


public class Acoes {
    private String papel;
    private String cotacao;
    private String pL;
    private String pVp;
    private String psr;
    private String divYield;
    private String pAtivo;
    private String pCapGiro;
    private String pEbit;
    private String pAtivCircLiq;
    private String evEbit;
    private String evEbitda;
    private String MrgEbit; //%
    private String MrgLiq;
    private String liqCorr;
    private String roic; //%    
    private String roe; //%
    private String liq2Meses;
    private String patrimLiq;
    private String divBrutPatrim;
    private String crescRec5a; //%

    public Acoes(String papel, String cotacao, String pL, String pVp, String psr, String divYield, String pAtivo, String pCapGiro, String pEbit, String pAtivCircLiq, String evEbit, String evEbitda, String MrgEbit, String MrgLiq, String liqCorr, String roic, String roe, String liq2Meses, String patrimLiq, String divBrutPatrim, String crescRec5a) {
        this.papel = papel;
        this.cotacao = cotacao;
        this.pL = pL;
        this.pVp = pVp;
        this.psr = psr;
        this.divYield = divYield;
        this.pAtivo = pAtivo;
        this.pCapGiro = pCapGiro;
        this.pEbit = pEbit;
        this.pAtivCircLiq = pAtivCircLiq;
        this.evEbit = evEbit;
        this.evEbitda = evEbitda;
        this.MrgEbit = MrgEbit;
        this.MrgLiq = MrgLiq;
        this.liqCorr = liqCorr;
        this.roic = roic;
        this.roe = roe;
        this.liq2Meses = liq2Meses;
        this.patrimLiq = patrimLiq;
        this.divBrutPatrim = divBrutPatrim;
        this.crescRec5a = crescRec5a;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public String getCotacao() {
        return cotacao;
    }

    public void setCotacao(String cotacao) {
        this.cotacao = cotacao;
    }

    public String getpL() {
        return pL;
    }

    public void setpL(String pL) {
        this.pL = pL;
    }

    public String getpVp() {
        return pVp;
    }

    public void setpVp(String pVp) {
        this.pVp = pVp;
    }

    public String getPsr() {
        return psr;
    }

    public void setPsr(String psr) {
        this.psr = psr;
    }

    public String getDivYield() {
        return divYield;
    }

    public void setDivYield(String divYield) {
        this.divYield = divYield;
    }

    public String getpAtivo() {
        return pAtivo;
    }

    public void setpAtivo(String pAtivo) {
        this.pAtivo = pAtivo;
    }

    public String getpCapGiro() {
        return pCapGiro;
    }

    public void setpCapGiro(String pCapGiro) {
        this.pCapGiro = pCapGiro;
    }

    public String getpEbit() {
        return pEbit;
    }

    public void setpEbit(String pEbit) {
        this.pEbit = pEbit;
    }

    public String getpAtivCircLiq() {
        return pAtivCircLiq;
    }

    public void setpAtivCircLiq(String pAtivCircLiq) {
        this.pAtivCircLiq = pAtivCircLiq;
    }

    public String getEvEbit() {
        return evEbit;
    }

    public void setEvEbit(String evEbit) {
        this.evEbit = evEbit;
    }

    public String getEvEbitda() {
        return evEbitda;
    }

    public void setEvEbitda(String evEbitda) {
        this.evEbitda = evEbitda;
    }

    public String getMrgEbit() {
        return MrgEbit;
    }

    public void setMrgEbit(String MrgEbit) {
        this.MrgEbit = MrgEbit;
    }

    public String getMrgLiq() {
        return MrgLiq;
    }

    public void setMrgLiq(String MrgLiq) {
        this.MrgLiq = MrgLiq;
    }

    public String getLiqCorr() {
        return liqCorr;
    }

    public void setLiqCorr(String liqCorr) {
        this.liqCorr = liqCorr;
    }

    public String getRoic() {
        return roic;
    }

    public void setRoic(String roic) {
        this.roic = roic;
    }

    public String getRoe() {
        return roe;
    }

    public void setRoe(String roe) {
        this.roe = roe;
    }

    public String getLiq2Meses() {
        return liq2Meses;
    }

    public void setLiq2Meses(String liq2Meses) {
        this.liq2Meses = liq2Meses;
    }

    public String getPatrimLiq() {
        return patrimLiq;
    }

    public void setPatrimLiq(String patrimLiq) {
        this.patrimLiq = patrimLiq;
    }

    public String getDivBrutPatrim() {
        return divBrutPatrim;
    }

    public void setDivBrutPatrim(String divBrutPatrim) {
        this.divBrutPatrim = divBrutPatrim;
    }

    public String getCrescRec5a() {
        return crescRec5a;
    }

    public void setCrescRec5a(String crescRec5a) {
        this.crescRec5a = crescRec5a;
    }
    
    @Override
    public String toString(){
        return papel + "\t" + cotacao + "\t" + pL + "\t" + pVp + "\t"
                + divYield + "\t" + roe + "\t" + liq2Meses + "\t"
                + patrimLiq + "\t" + divBrutPatrim;
    } 
            
            
}
