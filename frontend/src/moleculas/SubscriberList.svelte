<script>
    export let info;

</script>

<section>
    {#each info as subscriptor}
        <div class="contenedor">
            <div class="contenedor1">
                <h4>{subscriptor.name} {subscriptor.second}</h4>
            </div>
            <div class="contenedor2">
                <p>{subscriptor.address}</p>
                <p>{subscriptor.data}</p>
                <p>{subscriptor.phone}</p>
                <p>{subscriptor.email}</p>

            </div>
        </div>
        <hr>
    {/each}
</section>

<style>
    .contenedor {
        display: flex;
        justify-content: space-between;
        margin: 50px;
    }

    .contenedor1 {
        position: relative;
        width: 350px;
        left: 300px;
    }

    .contenedor2 {
        width: 600px;
    }

    p {
        display: flex;
        color: #254e5f;
        margin-bottom: 5px;
    }

    h4 {
        text-align: justify;
        font-size: 20px;
        color: #254e5f;
        font-style: italic;
    }
</style>
