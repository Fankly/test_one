<template>
  <Table stripe border :data="tableData" :columns="columns"></Table>
</template>

<script setup lang="tsx">
import Table from "@/components/base/Table.vue";
import { Columns } from "@/types/tableData";
import { ElTooltip } from "element-plus/lib/components/index.js";
import { ref } from "vue";

const columns = ref<Columns[]>([
  {
    prop: "name",
    label: "用户名"
  },
  {
    prop: "realname",
    label: "真实姓名",
    render: (scope: any) => {
      return (
        <ElTooltip content={getContent(scope.row)}>
          <span>测试</span>
        </ElTooltip>
      );
    }
  },
  {
    prop: "cellphone",
    label: "手机号码",
    render: (scope: any) => {
      return <a href="http://www.baidu.com">{scope.row.cellphone}</a>;
    }
  },
  {
    prop: "enable",
    label: "状态",
    slotName: "status"
  },
  {
    prop: "createAt",
    label: "创建时间",
    slotName: "createAt",
    minWidth: "120"
  },
  {
    prop: "updateAt",
    label: "更新时间",
    slotName: "updateAt",
    "show-overflow-tooltip": true
  },
  {
    label: "多级表头",
    children: [
      {
        prop: "test1",
        label: "State",
        width: "120"
      },
      {
        prop: "test2",
        label: "City",
        width: "120"
      },
      {
        prop: "test3",
        label: "City2",
        width: "120"
      }
    ]
  }
]);

// 清楚数据
const reset = () => {
  tableData.value = [];
};

const getContent = (row: { name: string }) => {
  return row.name + "测试1";
};
const tableData = ref([
  {
    name: "张三",
    realname: "张三",
    cellphone: "12345678901",
    enable: true,
    createAt: "2021-01-01 12:00:00",
    updateAt: "2021-01-01 12:00:00",
    test1: "test1",
    test2: "test2",
    test3: "test3"
  }
]);

defineExpose({
  reset
});
</script>

<style scoped></style>
