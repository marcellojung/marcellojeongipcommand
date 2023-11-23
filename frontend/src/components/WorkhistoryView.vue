<template>

    <v-data-table
        :headers="headers"
        :items="workhistory"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'WorkhistoryView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "workTypeId", value: "workTypeId" },
                { text: "workTypeCommand", value: "workTypeCommand" },
                { text: "masterip", value: "masterip" },
                { text: "connectId", value: "connectId" },
                { text: "connectpw", value: "connectpw" },
                { text: "userId", value: "userId" },
                { text: "userName", value: "userName" },
                { text: "userRole", value: "userRole" },
                { text: "workStatus", value: "workStatus" },
                { text: "workStatusResult", value: "workStatusResult" },
            ],
            workhistory : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/workhistories'))

            temp.data._embedded.workhistories.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.workhistory = temp.data._embedded.workhistories;
        },
        methods: {
        }
    }
</script>

