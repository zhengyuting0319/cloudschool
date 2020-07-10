<template>
  <v-app style="background-color:rgba(0,164,215,0.25)">
<div style="margin-top: 5%;color: #00b0ff;font-size: x-large">
  <span style="margin-right: 30%">
    <router-link  to="/Personal">
    <img src="../../../static/icon/主地图图标.png" height="40" width="40" />
    </router-link>
  </span>
  <span style="margin-right: 40%">
    待办
  </span>
</div>
      <v-list-item
        v-for="item in items"
        :key="item.title"
        class="card"
        @click="edit"
      >
        <v-list-item-avatar>
          <v-icon
            :class="[item.iconClass]"
            v-text="item.icon"
          ></v-icon>
        </v-list-item-avatar>

        <v-list-item-content>
          <v-list-item-title v-text="item.title"></v-list-item-title>
          <v-list-item-subtitle v-text="item.subtitle"></v-list-item-subtitle>
        </v-list-item-content>

        <v-list-item-action>
          <v-btn icon>
            <v-icon color="grey lighten-1">mdi-information</v-icon>
          </v-btn>
        </v-list-item-action>
      </v-list-item>

  </v-app>
</template>

<script>
   
    export default {
        data: () => ({

            items: [
                { icon: 'assignment', iconClass: 'blue white--text', title: 'Vacation itinerary', subtitle: 'Jan 20, 2014' },
                { icon: 'call_to_action', iconClass: 'amber white--text', title: 'Kitchen remodel', subtitle: 'Jan 10, 2014' },
                { icon: 'assignment', iconClass: 'blue white--text', title: 'Vacation itinerary', subtitle: 'Jan 20, 2014' },
                { icon: 'call_to_action', iconClass: 'amber white--text', title: 'Kitchen remodel', subtitle: 'Jan 10, 2014' },
                { icon: 'assignment', iconClass: 'blue white--text', title: 'Vacation itinerary', subtitle: 'Jan 20, 2014' },
                { icon: 'call_to_action', iconClass: 'amber white--text', title: 'Kitchen remodel', subtitle: 'Jan 10, 2014' },
                { icon: 'assignment', iconClass: 'blue white--text', title: 'Vacation itinerary', subtitle: 'Jan 20, 2014' },
                { icon: 'call_to_action', iconClass: 'amber white--text', title: 'Kitchen remodel', subtitle: 'Jan 10, 2014' },
                
            ],
                
            }),

        methods: {
            edit(){
              this.$router.push({path:'/EditTodo',query:{}});//传递参数
            },
        },
    }
</script>

  <style scoped>

    .card {
      margin-top: 4%;
      margin-left: 4%;
      /*display:inline-block;
      box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
      transition: 0.3s; */
      width: 90%;
      height:15%;
      border-radius: 25px;
      background-color: white;
    }
    .card:hover {
      box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
    }
</style>
