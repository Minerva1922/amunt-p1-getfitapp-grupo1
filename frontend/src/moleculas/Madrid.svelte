<script>
    export let info;
</script>

<section>
    {#each info as subscriptor}
        <div>
            <div class="contenedor1">
                <h4>{subscriptor.name} {subscriptor.second}</h4>
            </div>
            <div class="contenedor2">
                <p>{subscriptor.address}</p>
                <p>{subscriptor.data}</p>
                <p> {subscriptor.phone}</p>
                <p> {subscriptor.email}</p>
            </div>
        </div>
    {/each}
</section>
<hr>

<style>
    section {
        background-color: red;

    }

    div {
        background-color: green;
        display: flex;
        flex-direction: row;
        justify-content: space-between;
        margin: 50px;
        position: relative;
    }
    .contenedor2 {
        display: block;
        margin-right: 268px;
    }

</style>