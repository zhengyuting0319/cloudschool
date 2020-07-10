<template>
  <v-app style="background-color:rgba(0,164,215,0.25)">
  <div style="margin-right: 75%;margin-top: 5%" >
    <router-link  to="/">
      <img src="../../../static/icon/走廊图标.png" height="40" width="40" />
    </router-link>
  </div>

<div style="margin-top: 0%;color: #00b0ff;font-size: x-large">
  用户中心
</div>
    <div class="card">
      <div style="margin-right: 60%;margin-top: 4%">
        <v-avatar>
          <img
            src="https://cdn.vuetifyjs.com/images/john.jpg"
            alt="John"
          >
        </v-avatar>
      </div>
      <div style="margin-right: -30%;margin-top: -15%">
        John
        <br>
        223333大学
        <br>
        <div style="font-size: small">
          我的邀请码:123456
        </div>
      </div>
    </div>
    <div class="card2">
      <div style="margin-right: 60%;margin-top: 5%;color: #00b0ff;font-size: large">
        学习数据
      </div>
      <div style="margin-right: 60%;color: #00b0ff;font-size: smaller">
        2020-06-23
      </div>
      <div style="margin-top: 5%">
        <v-sparkline
          :value="value"
          :gradient="gradient"
          :labels="labels"
          :smooth="radius || false"
          :padding="padding"
          :line-width="width"
          :stroke-linecap="lineCap"
          :gradient-direction="gradientDirection"
          :fill="fill"
          :type="type"
          :auto-line-width="autoLineWidth"
          auto-draw
        ></v-sparkline>
    </div>
    </div>
    <div class="card3">
      <div style="margin-right: 70%;margin-top: 5%;color: #00b0ff;font-size: large">
        待办
      </div>
      <v-list-item
        v-for="item in items2"
        :key="item.title"
        @click="gotoToDo"
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
    </div>
    <div style="margin-top: 5%;">
      <div class="my-2" style="float: left;" >
        <v-btn small color="primary"
               @click="gotoAdd">
          创建房间</v-btn>
      </div>
      <div class="my-2" style="float: right">
        <v-btn small color="primary"
               @click="gotoJoin">
          加入房间</v-btn>
      </div>
    </div>

  </v-app>
</template>

<script>
    const gradients = [
    ['#222'],
    ['#42b3f4'],
    ['red', 'orange', 'yellow'],
    ['purple', 'violet'],
    ['#00c6ff', '#F0F', '#FF0'],
    ['#f72047', '#ffd200', '#1feaea'],
]
    export default {
        data: () => ({
            labels: [
                '12am',
                '3am',
                '6am',
                '9am',
                '12pm',
                '3pm',
                '6pm',
                '9pm',
                '12pm',
                '3pm',
                '6pm',
                '9pm',
                '12pm',
                '3pm',
                '6pm',
                '9pm',
            ],
            items2: [
                { icon: 'assignment', iconClass: 'blue white--text', title: 'Vacation itinerary', subtitle: 'Jan 20, 2014' },
                { icon: 'call_to_action', iconClass: 'amber white--text', title: 'Kitchen remodel', subtitle: 'Jan 10, 2014' },
            ],
                width: 2,
                radius: 10,
                padding: 8,
                lineCap: 'round',
                gradient: gradients[5],
                value: [0, 2, 5, 9, 5, 10, 3, 5, 0, 0, 1, 8, 2, 9, 0],
                gradientDirection: 'top',
                gradients,
                fill: false,
                type: 'trend',
                autoLineWidth: false,
            }),

        methods: {
            gotoAdd(){
                this.$router.push({path:'/AddRoom',query:{}});//传递参数
            },
            gotoJoin(){
                this.$router.push({path:'/JoinRoom',query:{}});//传递参数
            },
            gotoToDo(){
                this.$router.push({path:'/ToDo',query:{}});//传递参数
            },


        },
    }
</script>

  <style scoped>
    .card {
      margin-top: 5%;
      margin-left: 5%;
      display:inline-block;
      box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
      transition: 0.3s;
      width: 88%;
      height:15%;
      border-radius: 25px;
      background-color: white;
    }
    .card:hover {
      box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
    }
    .card2 {
      margin-left: 5%;
      margin-top: 5%;
      display:inline-block;
      box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
      transition: 0.3s;
      width: 88%;
      height:30%;
      border-radius: 25px;
      background-color: white;
    }
    .card2:hover {
      box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
    }
    .card3 {
      margin-top: 5%;
      margin-left: 5%;
      display:inline-block;
      box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
      transition: 0.3s;
      width: 88%;
      height:30%;
      border-radius: 25px;
      background-color: white;
    }
    .card3:hover {
      box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
    }
</style>
