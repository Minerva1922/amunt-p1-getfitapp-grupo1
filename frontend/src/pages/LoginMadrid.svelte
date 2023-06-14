<script>
    import {navigate} from "svelte-routing";

    let nombreUsuario = "";
    let password = "";
    let mensajeError ="";

    function handleSubmit(){
        if(nombreUsuario==="Madrid" && password==="GetFitEasy2023"){
            navigate("/madrid")
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