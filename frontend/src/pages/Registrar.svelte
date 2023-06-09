<script>
    import {navigate} from "svelte-routing";

    let nombreUsuario = "";
    let password = "";
    let mensajeError ="";


    function handleSubmit(){
        if(nombreUsuario==="Ali Siam" && password==="GetFitEasy2023"){
            navigate("/bienvenido")
        }else{
            mensajeError="Datos incorrectos"
        }
    }
</script>

<div>
    <h1>Login</h1>
    <form on:submit|preventDefault={handleSubmit}>
        <label>Usuario</label>
        <input type="text" bind:value={nombreUsuario}/>
        <label>Contraseña</label>
        <input type="password" bind:value={password}/>
        <button type="submit">Enviar</button>
    </form>

    {#if mensajeError}
        <p>Datos incorrectos</p>
    {/if}
</div>

<style>
    div {
        display: flex;
        justify-content: center;
        align-items: center;
        height: 50vh;
        background-image: url("../assets/esqueleto/logo getfiteasy.png");
        overflow: hidden;
        background-position: center;
        background-size: contain;
        background-repeat: no-repeat;
        flex-direction: column;
    }

    h1 {
        color: #254e5f;
        font-size: 54px;
        text-align: center;
        margin-bottom: 20px;
    }

    form {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        padding: 20px;
        border-radius: 8px;
    }

    label {
        margin-bottom: 5px;
        margin-right: 330px;
    }

    input {
        width: 400px;
        padding: 8px;
        margin-bottom: 10px;
        border-radius: 4px;
        border: 1px solid #ccc;
    }

    button {
        margin-right: 300px;
        width: 100px;
        height: 40px;
        border-radius: 30px;
        background-color: white;
        font-size: 15px;
    }

    button:hover {
        background-color: #02b2ec;
        color: white;
    }
    p{
        color:#02b2ec;
        font-size: 32px;
        border-radius: 8px;
    }
</style>