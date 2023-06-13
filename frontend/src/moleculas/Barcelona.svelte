<script>
    import { onMount } from "svelte";


    let subscribers;

    onMount(async () => {
        try {
            const response = await fetch("/subscribers/location/Barcelona");
            if (response.ok) {
                subscribers = await response.json();
            } else {
                console.error("Error al obtener los datos de Barcelona desde el backend");
            }
        } catch (error) {
            console.error("Error al realizar la solicitud HTTP a Barcelona", error);
        }
    });
</script>

<section>
    {#if subscribers}
        <div>
            <h3>{subscribers.name} {subscribers.second}</h3>
        </div>
        <div>
            <p>{subscribers.address}</p>
            <p>{subscribers.data}</p>
            <p>{subscribers.phone}</p>
            <p>{subscribers.email}</p>
        </div>
    {:else}
        <p>Cargando datos...</p>
    {/if}
</section>

<hr>

<style>
    section {
        display: flex;
        justify-content: space-around;
        margin-top: 40px;
    }

    h3 {
        text-align: justify;
        font-size: 35px;
        font-weight: 900;
        color: #254e5f;
    }

    p {
        display: flex;
        color: #254e5f;
        margin-bottom: 5px;
    }
</style>

