<template>

    <v-card outlined>
        <v-card-title>
            Workhistory # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="WorkTypeId" v-model="item.workTypeId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="WorkTypeCommand" v-model="item.workTypeCommand" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Masterip" v-model="item.masterip" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="ConnectId" v-model="item.connectId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Connectpw" v-model="item.connectpw" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="UserId" v-model="item.userId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="UserName" v-model="item.userName" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="UserRole" v-model="item.userRole" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="WorkStatus" v-model="item.workStatus" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="WorkStatusResult" v-model="item.workStatusResult" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'WorkhistoryViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/workhistories/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

