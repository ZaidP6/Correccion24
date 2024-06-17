function calcularGrados(densInicial, densFinal) {
    if (isNaN(densInicial) || isNaN(densFinal) || densInicial <= 0 || densFinal <= 0 || densInicial <= densFinal) {
        return -1;
    }
    let grados = (densInicial - densFinal) / 7.45;
    return parseFloat(grados.toFixed(2));
}

function anadirMensaje(mensaje, tipo) {
    let avisoDiv = document.getElementById('aviso');
    avisoDiv.innerHTML = '';
    let alertDiv = document.createElement('div');
    alertDiv.className = `alert alert-${tipo}`;
    alertDiv.textContent = mensaje;
    avisoDiv.appendChild(alertDiv);
}

function botonCalcularPulsado() {
    let densInicial = parseFloat(document.getElementById('densInicial').value);
    let densFinal = parseFloat(document.getElementById('densFinal').value);

    let grados = calcularGrados(densInicial, densFinal);
    if (grados === -1) {
        anadirMensaje('Datos erróneos. Asegúrese de que la densidad inicial es mayor que la densidad final y ambos son positivos.', 'danger');
    } else {
        anadirMensaje(`Su cerveza tendrá ${grados} grados`, 'success');
    }
}

function botonLimpiarPulsado() {
    document.getElementById('densInicial').value = '';
    document.getElementById('densFinal').value = '';
    document.getElementById('aviso').innerHTML = '';
}

let btnCalcular = document.getElementById('btnCalcular');
btnCalcular.addEventListener('click', botonCalcularPulsado);

let btnLimpiar = document.getElementById('btnLimpiar');
btnLimpiar.addEventListener('click', botonLimpiarPulsado);
