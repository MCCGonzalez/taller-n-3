public class cliente {
    private boolean _llamarMesero;
    private String _hacerPedido;
    private int _pagar;
    public mesero _mesero;

    public boolean getLlamarMesero() {
        return this._llamarMesero;
    }

    public void setLlamarMesero(boolean aLlamarMesero) {
        this._llamarMesero = aLlamarMesero;
    }

    public String getHacerPedido() {
        return this._hacerPedido;
    }

    public void setHacerPedido(String aHacerPedido) {
        this._hacerPedido = aHacerPedido;
    }

    public int getPagar() {
        return this._pagar;
    }

    public void setPagar(int aPagar) {
        this._pagar = aPagar;
    }
}
