<script>
    export let info;
</script>

<section>
    {#each info as subscriptor}
        <article>
            <div class="contenedor1">
                <h3>{subscriptor.name} {subscriptor.second}</h3>
            </div>
            <div class="contenedor2">
                <p>{subscriptor.address}</p>
                <p>{subscriptor.data}</p>
                <p> {subscriptor.phone}</p>
                <p> {subscriptor.email}</p>
            </div>
        </article>
    {/each}
</section>
<hr>

<style>
    article{
        margin-top: 10px;
        margin-bottom: 10px;
        display: flex;
        width: 100%;
        height: 200px;
        text-align: center;
        margin-left: 90px;
    }

    .contenedor1{
        justify-content: flex-end;
        position: absolute;


    }

    .contenedor2{
        margin-left: 700px;




    }
    section {
        display: flex;
        justify-content: space-around;
        margin-top: 40px;
        flex-direction: column;
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