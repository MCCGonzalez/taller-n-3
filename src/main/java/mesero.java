import java.util.Vector;

public class mesero {
    private String _tomarPedido;
    private boolean _entregarPedido;
    private boolean _entregarCuenta;
    public Vector<cliente> _clientes = new Vector<cliente>();

    public String getTomarPedido() {
        return this._tomarPedido;
    }

    public void setTomarPedido(String aTomarPedido) {
        this._tomarPedido = aTomarPedido;
    }

    public boolean getEntregarPedido() {
        return this._entregarPedido;
    }

    public void setEntregarPedido(boolean aEntregarPedido) {
        this._entregarPedido = aEntregarPedido;
    }

    public boolean getEntregarCuenta() {
        return this._entregarCuenta;
    }

    public void setEntregarCuenta(boolean aEntregarCuenta) {
        this._entregarCuenta = aEntregarCuenta;
    }
}
