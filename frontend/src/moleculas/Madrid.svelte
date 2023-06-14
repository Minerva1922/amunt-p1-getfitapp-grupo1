<script>
    export let info;
</script>

<section>
    {#each info as subscriptor}
        <article>
            <div>
                <h3>{subscriptor.name} {subscriptor.second}</h3>
            </div>
            <div>
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