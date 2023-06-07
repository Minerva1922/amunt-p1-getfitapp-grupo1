<script>
    const subscribers = {
        "id": 9128476,
        "name": "Jhoana",
        "lastName": "Vicente",
        "address": "Gran Via 123, 1-2 98371",
        "subscriptionDate": "2023/03/04",
        "phone": "987654321",
        "email": "jhoana@example.com"
    };
</script>
<section>
    <div>
        <h3>{subscribers.name} {subscribers.lastName}</h3>
    </div>
    <div>
        <p>{subscribers.address}</p>
        <p>{subscribers.subscriptionDate}</p>
        <p> {subscribers.phone}</p>
        <p> {subscribers.email}</p>
    </div>
</section>
<hr>

<style>
    section{
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