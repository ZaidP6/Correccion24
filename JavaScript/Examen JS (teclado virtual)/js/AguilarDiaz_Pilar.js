function comprobarPIN(pinEscrito, pinEsperado){

    if (typeof pinEscrito == 'number' && typeof pinEsperado == 'number') {

        if (pinEscrito >= 0 && pinEscrito <= 9999) {
            
            if(pinEscrito === pinEsperado){
                return true;
            }else
             return false;
        }else
            return false;
    }else
        return false;
}

function anadirMensaje(mensaje, tipo) {
    
    let avisoDiv = document.getElementById('aviso');
    avisoDiv.innerHTML = '';
    avisoDiv.className = 'badge badge-pill';

    if (tipo === 'error') {
        avisoDiv.classList.add('badge-danger');
    } else if (tipo === 'exito') {
        avisoDiv.classList.add('badge-success'); 
    }

    avisoDiv.textContent = mensaje;
}

function botonNumericoPulsado(event){
    let boton = document.getElementById('botonPulsado');
    let pinEscrito = input.value;

    if(pinEscrito.length >4){
        anadirMensaje('El PIN no puede tener más de 4 dígitos', 'error')
    }

}

function botonComprobarPulsado() {
    let boton = document.getElementById('botonPulsado');
    let pinEscrito = parseInt(boton.value, 10)
    let pinEsperado = 1234;

    if (comprobarPIN(pinEscrito, pinEsperado)) {
        anadirMensaje('PIN correcto', 'exito');
    } else {
        anadirMensaje('PIN incorrecto', 'error');
    }
}

function botonLimpiarPulsado(){
    let boton = document.getElementById('botonPulsado');
    let avisoDiv = document.getElementById('aviso');

    boton.value = '';
    avisoDiv.innerHTML = '';
    avisoDiv.className = '';
}