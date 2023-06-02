<script>
 import Clases from "./Clases.svelte";
 export let dia;
</script>

<div>
    <h1>{dia}</h1>
    <button>Reservar Clase</button>
</div>


<style>
    button {
        margin-top: 50px;
        width: 200px;
        height: 60px;
        border-radius: 30px;
        background-color: white;
    }
    button:hover{
        background-color: black;
        color: white;
    }
</style>

