let filaPendiente = false;

function anadirFila() {
    if (!filaPendiente) {
        let tabla = document.getElementById("tabla").getElementsByTagName('tbody')[0];
        let nuevaFila = tabla.insertRow();
        let celda1 = nuevaFila.insertCell(0);
        let celda2 = nuevaFila.insertCell(1);
        let celda3 = nuevaFila.insertCell(2);

        celda1.innerHTML = '<input type="text" class="form-control" id="nuevoBocadillo" placeholder="Tipo de Bocadillo">';
        celda2.innerHTML = '<input type="number" class="form-control" id="nuevoPrecio" placeholder="Precio">';
        celda3.innerHTML = '<button class="btn btn-info" onclick="validarFila()">Validar Fila</button>';
        
        filaPendiente = true;
        document.getElementById("validar").style.display = "block";
    } else {
        anadirMensaje("Solo puede haber una fila pendiente de validar.", "alert-warning");
    }
}

function validarFila() {
    let bocadillo = document.getElementById("nuevoBocadillo").value;
    let precio = document.getElementById("nuevoPrecio").value;

    if (bocadillo.trim() === "" || precio.trim() === "") {
        anadirMensaje("Todos los campos deben estar rellenados.", "alert-danger");
    } else if (isNaN(precio) || Number(precio) <= 0) {
        anadirMensaje("El precio debe ser un número positivo.", "alert-danger");
    } else {
        let tabla = document.getElementById("tabla").getElementsByTagName('tbody')[0];
        let nuevaFila = tabla.rows[tabla.rows.length - 1];
        
        nuevaFila.cells[0].innerHTML = bocadillo;
        nuevaFila.cells[1].innerHTML = `${Number(precio).toFixed(2)}€`;
        nuevaFila.deleteCell(2);
        
        filaPendiente = false;
        document.getElementById("validar").style.display = "none";
        anadirMensaje("Fila validada correctamente.", "alert-success");
    }
}

function anadirMensaje(mensaje, tipo) {
    let aviso = document.getElementById("aviso");
    aviso.innerHTML = `<div class="alert ${tipo} alert-dismissible fade show" role="alert">${mensaje}<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button></div>`;
}

function limpiarMensaje() {
    let aviso = document.getElementById("aviso");
    aviso.innerHTML = "";
}

document.addEventListener('DOMContentLoaded', () => {
    document.getElementById("anadirFila").addEventListener("click", anadirFila);
});