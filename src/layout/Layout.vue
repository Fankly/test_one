<template>
  <Table :data="tableData" :columns="columns">
  </Table>
</template>

<script setup lang="ts">
import Table from "@/components/base/Table.vue";

import {onMounted, ref, render} from "vue";

const columns: any = ref([
  {
    prop: 'name',
    label: '用户名'

  },
  {
    prop: 'realname',
    label: '真实姓名',
    render: (scope: any) => {
    }
  },
  {
    prop: 'cellphone',
    label: '手机号码'
  },
  {
    prop: 'enable',
    label: '状态',
    slotName: 'status'
  },
  {
    prop: 'createAt',
    label: '创建时间',
    slotName: 'createAt',
    minWidth: '120'
  },
  {
    prop: 'more',
    minWidth: '130',
  },
  {
    prop: 'updateAt',
    label: '更新时间',
    slotName: 'updateAt',
    'show-overflow-tooltip': true
  },
  {
    label: '多级表头',
    children: [
      {
        prop: 'test1',
        label: 'State',
        width: '120'
      }, {
        prop: 'test2',
        label: 'City',
        width: '120'
      }, {
        prop: 'test3',
        label: 'City2',
        width: '120'
      }
    ]
  }
]);


const tableData = ref([]);

</script>

<style scoped></style>
